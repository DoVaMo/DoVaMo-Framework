package codeGeneration;

/**
 * Record storing data about a usedGenPackage of a genmodel 
 */
public record UsedGenPackageData(
	/**
	 * The name of the model that defines the used genpackage
	 */
	String modelName,
	/**
	 * The path to the model folder that contains the genmodel that defines the used genpackage.
	 * This path should be relative to the genmodel for which the code should be generated. 
	 */
	String pathToModelFolderFromGenModel,
	/**
	 * The path to the model folder that contains the genmodel that defines the used genpackage.
	 * This path should be relative to the project that runs the code generation. 
	 */
	String pathToModelFolderFromGeneratorProject
){}
