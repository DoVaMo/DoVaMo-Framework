package mavenModuleGeneration;

/**
 * Data class for storing the information found in a Maven module config file.
 */
public record MavenModuleConfig(
		/**
		 * The name of the maven project into which the module should be created
		 */
		String mavenProjectPath, 
		
		/**
		 * The name of the new module that should be created
		 */
		String newModuleName, 
		
		/**
		 * The artifact ID of the new module that should be created
		 */
		String newModuleArtifactID,
		
		/**
		 * The packaging of the new module that should be created
		 */
		String packaging,
		
		/**
		 * The folder into which the model should be copied
		 */
		String modelDirectory,
		
		/**
		 * The name of the model that should be copied into the module
		 */
		String modelName,
		
		/**
		 * The path from which the model should be copied
		 */
		String modelOriginDirectory
) {}
