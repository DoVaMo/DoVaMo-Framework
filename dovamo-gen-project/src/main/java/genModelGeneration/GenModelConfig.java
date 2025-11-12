package genModelGeneration;

import java.util.List;

/**
 * Data class for storing the information found in a GenModel config file.
 */
public record GenModelConfig(
	/**
	 * Path to the folder where the genmodel should be created as seen by the generating project
	 */
	String pathToModelFolderFromGeneratingProject,
	
	/**
	 * The path to the model folder from inside modeling project (needed when opened in eclipse)
	 */
	String localModelPath,
	
	/**
	 * The name of the ecore model for which the genmodel should be created
	 */
	String modelName,
	
	/**
	 * The directory in which the genmodel should generate its model code
	 */
	String modelCodeDirectory,
	
	/**
	 * The directory in which the genmodel should generate its test code
	 */
	String testCodeDirectory,
	
	/**
	 * The directory in which the genmodel should generate its edit code
	 */
	String editCodeDirectory,
	
	/**
	 * The directory in which the genmodel should generate its editor code
	 */
	String editorCodeDirectory,
	
	/**
	 * The ID for the model plugin that needs to be configured for the code generation to work
	 */
	String modelPluginID,
	
	/**
	 * The ID for the tests plugin that needs to be configured for the tests to work
	 */
	String testsPluginID,
	
	/**
	 * The ID for the edit plugin that needs to be configured for the edit code to work
	 */
	String editPluginID,
	
	/**
	 * The ID for the tests plugin that needs to be configured for the editor code to work
	 */
	String editorPluginID,
	
	/**
	 * Boolean indicating whether the properties extensibleProviderFactory and childCreationExtenders should be set to true 
	 */
	boolean activateExtensibilityFeatures,
	
	/**
	 * A list of paths to GenPackages that should be excluded from code generation
	 */
	List<String> excludedGenPackagesPaths,
	
	/**
	 * A list of predefined method bodies
	 */
	List<MethodBodyData> predefinedBodies
) {}
