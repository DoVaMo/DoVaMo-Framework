import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import emfProjectGeneration.EMFProjectGenerator;
import genModelGeneration.GenModelConfig;
import genModelGeneration.GenModelGenerator;
import mavenModuleGeneration.MavenModuleGenerator;

public class Main {

	public static void main(String[] args) {
		boolean createEMFProject = true;
		boolean createMavenModule = true;
		
		if (createEMFProject) {
			try {
				EMFProjectGenerator.createEMFProject(EMFProjectGenerator.readEMFProjectConfigFile(Paths.get("./emfProjectConfig.json")));
				GenModelGenerator.createGenModel(GenModelGenerator.readGenModelConfigFile(Paths.get("./emfProjectGenModelConfig.json")));
			} catch (IOException e) {
				System.out.println("Unable to generate EMF project");
				e.printStackTrace();
			}
		}
		
		if (createMavenModule) {
			try {
				MavenModuleGenerator.createMavenModule(MavenModuleGenerator.readMavenModuleConfigFile(Paths.get("./mavenModuleConfig.json")));
				GenModelGenerator.createGenModel(GenModelGenerator.readGenModelConfigFile(Paths.get("./mavenModuleGenModelConfig.json")));
			} catch (IOException e) {
				System.out.println("Unable to generate Maven module");
				e.printStackTrace();
			}	
		}
	}
}
