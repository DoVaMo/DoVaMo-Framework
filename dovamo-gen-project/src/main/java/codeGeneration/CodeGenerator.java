package codeGeneration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.Gson;

import utils.FileUtils;

public class CodeGenerator {
	
	/**
	 * Reads the config file for the code generation and generates a {@link CodeGenerationConfig}.
	 * 
	 * @param pathToConfigFile the path to the config file
	 * @return a {@link CodeGenerationConfig} with the data from the config file
	 * @throws IOException if the path to the config file is invalid or the config file is misformed
	 */
	public static CodeGenerationConfig readCodeGenerationConfigFile(Path pathToConfigFile) throws IOException {
		String fileContent = Files.readString(pathToConfigFile);
		Gson gson = new Gson();
		return gson.fromJson(fileContent, CodeGenerationConfig.class);
	}
	
	/**
	 * Generates code based on the config.
	 * Depending on the config, the model, edit, editor or test code is generated using the provided genmodel.
	 * 
	 * @param config the {@link CodeGenerationConfig} that specifies the code generation
	 * @throws IOException if the paths in the config are invalid
	 */
	public static void generateCode(CodeGenerationConfig config) throws IOException {
		System.out.println("=== Generating code ===");
		System.out.println("Config: " + config.toString());
		
		//Register extensions
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);
		
		//Load the ecore model
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		
		// Remove Eclipse-specific URI handler that causes unmapped path issues
		resourceSet.getURIConverter().getURIHandlers().removeIf(
		    h -> h instanceof org.eclipse.emf.ecore.resource.impl.PlatformResourceURIHandlerImpl
		);

		//The absolute path of the model folder of the project for which the code should be created
		String absolutePathToModelFolder = Paths.get(config.pathToModelFolderFromGeneratingProject()).toAbsolutePath().toString();
		
		// Add a plain file URI handler
		resourceSet.getURIConverter().getURIHandlers().add(new org.eclipse.emf.ecore.resource.impl.URIHandlerImpl());
		
		URI ecoreUri = URI.createFileURI(absolutePathToModelFolder + "/" + config.modelName() + ".ecore");
		resourceSet.getResource(ecoreUri, true);
		
		resourceSet.getURIConverter().getURIMap().put(
			    URI.createURI(config.modelName() + ".ecore"),
			    ecoreUri
			);			
		
		//Fix platform URIs
		URI projectUri = URI.createFileURI(config.pathOfModelingProject() + "/");
		URI platformProjectUri = URI.createPlatformResourceURI(config.modelPluginID() + "/", true);
		resourceSet.getURIConverter().getURIMap().put(
			    platformProjectUri,
			    projectUri
			);
		
		//Load the genmodel for which the code should be generated
		URI genModelUri = URI.createFileURI(absolutePathToModelFolder + "/" + config.modelName() + ".genmodel");
		Resource genModelResource = resourceSet.getResource(genModelUri, true);
		GenModel genModel = (GenModel) genModelResource.getContents().get(0);
		
		EcoreUtil.resolveAll(genModel);
		
		//Configure genModel
		genModel.reconcile();
		genModel.setCanGenerate(true);
		
		//Generate code
		Generator generator = new Generator();
		generator.setInput(genModel);
						
		if (config.generateModelCode()) {
			System.out.println("=== Generating model code ===");
			generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor.Printing(System.out));
			try {
				FileUtils.makeSrcFolderInProject(config.pathOfModelingProject(), FileUtils.extractLowestDirectory(genModel.getModelDirectory()));
			} catch (Exception e) {
				System.out.println("Unable to make model code folder a src folder");
				e.printStackTrace();
			}
		}
		if (config.generateEditCode()) {
			System.out.println("=== Generating edit code ===");
			generator.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE, new BasicMonitor.Printing(System.out));
		}
		if (config.generateEditorCode()) {
			System.out.println("=== Generating editor code ===");
			generator.generate(genModel, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE, new BasicMonitor.Printing(System.out));
		}
		if (config.generateTestCode()) {
			System.out.println("=== Generating test code ===");
			generator.generate(genModel, GenBaseGeneratorAdapter.TESTS_PROJECT_TYPE, new BasicMonitor.Printing(System.out));
		}
		
		System.out.println("=== Generated code ===");
	}
}
