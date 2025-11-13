package emfProjectGeneration;

/**
 * Data class for storing the information found in a EMF Project config file.
 */
public record EMFProjectConfig(
		/**
		 * The name of the project that should be created
		 */
		String projectName, 
		/**
		 * The path of the directory into which the project should be created
		 */
		String projectPath,
		/**
		 * The path to the ecore model that should be copied into the newly created project
		 */
		String modelPath, 
		
		/**
		 * The name of the ecore model that should be copied into the newly created project
		 */
		String modelName
) {}
