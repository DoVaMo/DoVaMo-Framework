package codeGeneration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * Preloads genmodels and ecore models into a resourceSet so they can be resolved correctly later.
	 * If there are any used GenPackages in the genmodel for which code should be generated, they need to be preloaded 
	 * 
	 * @param resourceSet the resourceSet that will be used to load the main genmodel
	 * @param pathToGeneratingGenModel the path relative to the this file
	 * @param modelFolderPaths the paths of the model folder containing the genmodels that contain the usedGenPackages
	 */
	private static void preloadUsedGenModels(ResourceSetImpl resourceSet, String pathToGeneratingGenModel, List<UsedGenPackageData> usedGenPackages) {
		/*
		 * Because the generator can sometimes not resolve the GenPackages with the paths specified in the genmodel,
		 * the genmodels the contain the usedGenPackages and their respective ecore models need to be loaded in the same resourceSet.
		 */
		for (UsedGenPackageData usedGenPackage : usedGenPackages) {
			//Load the ecore model
			String correctModelPath = Paths.get(usedGenPackage.pathToModelFolderFromGeneratorProject(), usedGenPackage.modelName() + ".ecore").toAbsolutePath().normalize().toString();
			System.out.println("Correct Path to genModel:" + correctModelPath);
			URI correctModelURI = URI.createFileURI(correctModelPath);
			System.out.println(correctModelURI.toFileString());
			
			//The path as seen from the genmodel
			String genModelPathToModel = Paths.get(pathToGeneratingGenModel, usedGenPackage.pathToModelFolderFromGenModel(), usedGenPackage.modelName() + ".ecore").toAbsolutePath().normalize().toString();
			System.out.println("Genmodel path: " + genModelPathToModel);
			URI genModelURIForModel = URI.createFileURI(genModelPathToModel);
			
			resourceSet.getURIConverter().getURIMap().put(genModelURIForModel, correctModelURI);
			resourceSet.getResource(correctModelURI, true);
			
			//Load the genmodel
			String correctGenModelPath = Paths.get(usedGenPackage.pathToModelFolderFromGeneratorProject(), usedGenPackage.modelName() + ".genmodel").toAbsolutePath().normalize().toString();
			URI correctGenModelURI = URI.createFileURI(correctGenModelPath);
			
			//The path as seen from the genmodel
			String genModelPathToGenModel = Paths.get(pathToGeneratingGenModel, usedGenPackage.pathToModelFolderFromGenModel(), usedGenPackage.modelName() + ".genmodel").toAbsolutePath().normalize().toString();
			URI genModelURIForGenModel = URI.createFileURI(genModelPathToGenModel);
			
			resourceSet.getURIConverter().getURIMap().put(genModelURIForGenModel, correctGenModelURI);
			resourceSet.getResource(correctGenModelURI, true);
		}
		
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
		
		//Add a plain file URI handler
		resourceSet.getURIConverter().getURIHandlers().add(new org.eclipse.emf.ecore.resource.impl.URIHandlerImpl());
		
		//Preload the used genModels so that the referenced GenPackages are resolved correctly 
		preloadUsedGenModels(resourceSet, config.pathToModelFolderFromGeneratingProject(), config.usedGenPackages());

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
			//Trying to make the generated code a source folder for eclipse compatibility
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
