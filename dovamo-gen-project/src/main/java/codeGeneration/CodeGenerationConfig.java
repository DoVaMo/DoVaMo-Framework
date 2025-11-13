package codeGeneration;

/**
 * Record storing data that configures the code generation.
 */
public record CodeGenerationConfig(
		/**
		 * The relative path of the model folder as seen from the generation project
		 */
		String pathToModelFolderFromGeneratingProject,
		/**
		 * The path of the of the model folder that contains the genmodel (can be absolute or relative to the generation project)
		 */
		String pathOfModelingProject,
		/**
		 * Name of the modeling project
		 */
		String modelPluginID,
		/**
		 * Name of the ecore model
		 */
		String modelName,
		/**
		 * Boolean indicating if the model code should be generated
		 */
		Boolean generateModelCode,
		/**
		 * Boolean indicating if the edit code should be generated
		 */
		Boolean generateEditCode,
		/**
		 * Boolean indicating if the editor code should be generated
		 */
		Boolean generateEditorCode,
		/**
		 * Boolean indicating if the test code should be generated
		 */
		Boolean generateTestCode
) {}
