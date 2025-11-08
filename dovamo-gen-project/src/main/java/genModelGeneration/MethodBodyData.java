package genModelGeneration;

/**
 * Record for storing data for predefining method bodies.
 */
public record MethodBodyData(
		/**
		 * The package that contains the method for which the body should be added
		 */
		String packageName,
		
		/**
		 * The class that contains the method for which the body should be added
		 */
		String className,
		
		/**
		 * The method for which the body should be added
		 */
		String methodName,
		
		/**
		 * The body that should be added
		 */
		String body
) {}
