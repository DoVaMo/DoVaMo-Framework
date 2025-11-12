package mavenModuleGeneration;
	
import java.io.*;
import java.nio.file.*;
import java.util.*;

import com.google.gson.Gson;

import utils.FileUtils;

/**
 * Class that provides a method for reading a Maven module config file and for generating a Maven module.
 */
public class MavenModuleGenerator {
	
	/**
	 * Reads the config file for the maven module generation and generates a {@link MavenModuleConfig}.
	 * 
	 * @param pathToConfigFile the path to the config file
	 * @return a {@link MavenModuleConfig} with the data from the config file
	 * @throws IOException if the path to the config file is invalid or the config file is misformed
	 */
	public static MavenModuleConfig readMavenModuleConfigFile(Path pathToConfigFile) throws IOException {
		String fileContent = Files.readString(pathToConfigFile);
		Gson gson = new Gson();
		return gson.fromJson(fileContent, MavenModuleConfig.class);
	}

	/**
	 * Method that creates a new Maven module at a given location corresponding the the data given in the config.
	 * Then copies a metamodel into the module.
	 * 
	 * @param config the {@link MavenModuleConfig} containing the configuration for the new project
	 * @throws IOException if the paths in the config are invalid
	 */
    public static void createMavenModule(MavenModuleConfig config) throws IOException {
    	System.out.println("=== Creating a new maven module ===");
    	System.out.println("Config: " + config.toString());
    	
    	Path mavenProjectPath = Paths.get(config.mavenProjectPath());
    	Path parentPomPath = mavenProjectPath.resolve("pom.xml");
    	
    	String groupId = FileUtils.extractXMLTagContent(parentPomPath, "groupId");
    	String projectArtifactId = FileUtils.extractXMLTagContent(parentPomPath, "artifactId");
    	String projectVersion = FileUtils.extractXMLTagContent(parentPomPath, "version");
    	
		Path modulePath = mavenProjectPath.resolve(config.newModuleName());
		
		// Step 1: Create module directory structure
		Files.createDirectories(modulePath.resolve("src/main/java"));
		Files.createDirectories(modulePath.resolve("src/test/java"));
		
		// Create the directory for the model
		Path modelDirectory = modulePath.resolve(config.modelDirectory());
		Files.createDirectories(modelDirectory);		
		
		// Step 2: Generate pom.xml for new module
		String pomContent = generateModulePom(groupId, projectArtifactId, projectVersion, config.newModuleName(), config.packaging());
		Files.writeString(modulePath.resolve("pom.xml"), pomContent);
		
		// Step 3: Modify parent POM
		updateParentPom(parentPomPath, config.newModuleName());
		
		// Copy the model files into the module
		Files.copy(Paths.get(config.modelOriginDirectory()).resolve(config.modelName() + ".ecore"), modelDirectory.resolve(config.modelName() + ".ecore"), StandardCopyOption.REPLACE_EXISTING);
		Files.copy(Paths.get(config.modelOriginDirectory()).resolve(config.modelName() + ".aird"), modelDirectory.resolve(config.modelName() + ".aird"), StandardCopyOption.REPLACE_EXISTING);
	
		
		System.out.println("=== Maven module '" + config.newModuleName() + "' created and added to the " + mavenProjectPath.toString() + " project ===");
	}
	
    /**
     * Generates the module pom.xml file by filling in the given data into a template.
     * 
     * @param groupId the groupId of the new module
     * @param parentArtifactId the artifactId of the parent Maven project of the new module
     * @param version the version of the new module
     * @param artifactId the artifactId of the new module
     * @param packaging the packaging of the new module
     * @return
     */
	private static String generateModulePom(String groupId, String parentArtifactId, String version, String artifactId, String packaging) {
	    return """
	        <project xmlns="http://maven.apache.org/POM/4.0.0"
	                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	                 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
	                                     http://maven.apache.org/xsd/maven-4.0.0.xsd">
	          <modelVersion>4.0.0</modelVersion>
	
	          <parent>
	            <groupId>%s</groupId>
	            <artifactId>%s</artifactId>
	            <version>%s</version>
	            <relativePath>../pom.xml</relativePath>
	          </parent>
	
	          <artifactId>%s</artifactId>
	          <packaging>%s</packaging>
	          <dependencies>
	            <!-- Add dependencies here -->
	          </dependencies>
	        </project>
	        """.formatted(groupId, parentArtifactId, version, artifactId, packaging);
	}
	
	/**
	 * Updates the parent pom.xml by adding the module to the modules-section if it is not already present
	 * 
	 * @param pomPath the {@link Path} to the parent pom file
	 * @param newModuleName the name of the module that should be added
	 * @throws IOException if the path is invalid
	 */
	private static void updateParentPom(Path pomPath, String newModuleName) throws IOException {
	    List<String> lines = Files.readAllLines(pomPath);
	    List<String> updatedLines = new ArrayList<>();
	    boolean insideModules = false;
	
	    for (String line : lines) {
	    	if (line.contains(newModuleName)) {
	    		//The module was already added to the parent pom
	    		return;
	    	}
	        if (line.contains("<modules>")) {
	        	//Now inside the module segment of the parent pom
	            insideModules = true;
	        } else if (insideModules && line.contains("</modules>")) {
	            updatedLines.add("    <module>" + newModuleName + "</module>");
        		insideModules = false;
	        }
	        updatedLines.add(line);
	    }
	
        Files.write(pomPath, updatedLines);
	}
	
}

