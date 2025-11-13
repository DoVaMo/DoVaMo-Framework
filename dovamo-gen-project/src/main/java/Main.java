import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import codeGeneration.CodeGenerationConfig;
import codeGeneration.CodeGenerator;
import emfProjectGeneration.EMFProjectGenerator;
import genModelGeneration.GenModelConfig;
import genModelGeneration.GenModelGenerator;
import mavenModuleGeneration.MavenModuleGenerator;
import utils.FileUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean createEMFProject = true;
		boolean createMavenModule = false;
		boolean generateEMFCode = true;
		boolean generateMavenCode = false;
		
		if (createEMFProject) {
			try {
				EMFProjectGenerator.createEMFProject(EMFProjectGenerator.readEMFProjectConfigFile(Paths.get("./emfProjectConfig.json")));
				
				GenModelConfig genModelConfig = GenModelGenerator.readGenModelConfigFile(Paths.get("./emfProjectGenModelConfig.json"));
				GenModelGenerator.createGenModel(genModelConfig);
					
				/*
				 * The pathToModelFolderFromGeneratingProject is the relative path to the project, therefore its format is similar to ../[...]/ProjectName/[...]/model
				 * Also the modelPluginID is ProjectName
				 * We can therefore get the path to the project by retrieving ../[...]/ProjectName
				 */
				int index = genModelConfig.pathToModelFolderFromGeneratingProject().indexOf(genModelConfig.modelPluginID());
				String substring = genModelConfig.pathToModelFolderFromGeneratingProject().substring(0, index - 1);
				String localPathToProject = substring.concat("/" + genModelConfig.modelPluginID());
				String absolutePathToProject = Paths.get(localPathToProject).toAbsolutePath().toString();
				if (generateEMFCode) {
					CodeGenerator.generateCode(new CodeGenerationConfig(genModelConfig.pathToModelFolderFromGeneratingProject(), absolutePathToProject, genModelConfig.modelPluginID(), genModelConfig.modelName(), true, false, false, false));
				}
				
			} catch (IOException e) {
				System.out.println("Unable to generate EMF project");
				e.printStackTrace();
			}
		}
		
		if (createMavenModule) {
			try {
				MavenModuleGenerator.createMavenModule(MavenModuleGenerator.readMavenModuleConfigFile(Paths.get("./mavenModuleConfig.json")));
				//Disclaimer: Editing the .ecore file that was copied into the module. Only necessary because the ecore metamodel is copied and not created in-place
				Path path = Paths.get("../ExampleMavenProject/GeneratedMavenModule/src/main/resources/model/ecoreModelingProjectTemplate.ecore");
				Charset charset = StandardCharsets.UTF_8;

				String content = new String(Files.readAllBytes(path), charset);
				content = content.replaceAll("../../AnimalMetamodel", "../../../../../AnimalMetamodel");
				Files.write(path, content.getBytes(charset));
				
				GenModelGenerator.createGenModel(GenModelGenerator.readGenModelConfigFile(Paths.get("./mavenModuleGenModelConfig.json")));
			} catch (IOException e) {
				System.out.println("Unable to generate Maven module");
				e.printStackTrace();
			}	
		}
		
		if (generateMavenCode) {
			try {
				CodeGenerator.generateCode(CodeGenerator.readCodeGenerationConfigFile(Paths.get("./codeGenerationConfig.json")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
