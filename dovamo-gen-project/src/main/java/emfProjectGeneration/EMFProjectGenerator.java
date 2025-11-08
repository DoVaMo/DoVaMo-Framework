package emfProjectGeneration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import com.google.gson.Gson;

/**
 * Class that provides a method for reading a EMF project config file and for generating a EMF project.
 */
public class EMFProjectGenerator {
	
	/**
	 * Reads the config file for the project generation and generates a {@link EMFProjectConfig}.
	 * 
	 * @param pathToConfigFile the path to the config file
	 * @return a {@link EMFProjectConfig} with the data from the config file
	 * @throws IOException if the path to the config file is invalid or the config file is misformed
	 */
	public static EMFProjectConfig readEMFProjectConfigFile(Path pathToConfigFile) throws IOException {
		String fileContent = Files.readString(pathToConfigFile);
		Gson gson = new Gson();
		return gson.fromJson(fileContent, EMFProjectConfig.class);
	}

	/**
	 * Method that creates a new EMF project at a given location corresponding the the data given in the config.
	 * 
	 * @param config the {@link EMFProjectConfig} containing the configuration for the new project
	 * @throws IOException if the paths in the config are invalid
	 */
	public static void createEMFProject(EMFProjectConfig config) throws IOException {
		System.out.println("=== Creating a new EMF project ===");
		System.out.println("Config: " + config.toString());
		
		//The import of the existing model could be solved better
		Path rootDir = Paths.get("../", config.projectName());
		Path modelPath = Paths.get(config.modelPath());
		Files.createDirectories(rootDir);

		// Create Eclipse .project file
		Files.writeString(rootDir.resolve(".project"), String.format("""
			<?xml version="1.0" encoding="UTF-8"?>
			<projectDescription>
				<name>%s</name>
				<comment></comment>
				<projects>
				</projects>
				<buildSpec>
					<buildCommand>
						<name>org.eclipse.jdt.core.javabuilder</name>
						<arguments>
						</arguments>
					</buildCommand>
					<buildCommand>
						<name>org.eclipse.pde.ManifestBuilder</name>
						<arguments>
						</arguments>
					</buildCommand>
					<buildCommand>
						<name>org.eclipse.pde.SchemaBuilder</name>
						<arguments>
						</arguments>
					</buildCommand>
				</buildSpec>
				<natures>
					<nature>org.eclipse.sirius.nature.modelingproject</nature>
					<nature>org.eclipse.jdt.core.javanature</nature>
					<nature>org.eclipse.pde.PluginNature</nature>
				</natures>
			</projectDescription>
			""", config.projectName()));

		// Create .classpath
		Files.writeString(rootDir.resolve(".classpath"), """
				<?xml version="1.0" encoding="UTF-8"?>
				<classpath>
					<classpathentry kind="src" path="src"/>
					<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-21"/>
					<classpathentry kind="con" path="org.eclipse.pde.core.requiredPlugins"/>
					<classpathentry kind="output" path="bin"/>
				</classpath>
				""");
		
		//Create src folder
		Path srcDir = rootDir.resolve("src");
		Files.createDirectories(srcDir);

		// Create model directory
		Path modelDir = rootDir.resolve("model");
		Files.createDirectories(modelDir);
		
		// Create model directory
		Path metaInfDir = rootDir.resolve("META-INF");
		Files.createDirectories(metaInfDir);
		
		// Writing the MANIFEST file
		Files.writeString(metaInfDir.resolve("MANIFEST.MF"), """
				Manifest-Version: 1.0
				Bundle-ManifestVersion: 2
				Bundle-Name: %s
				Bundle-SymbolicName: %s; singleton:=true
				Bundle-Version: 0.1.0.qualifier
				Require-Bundle: org.eclipse.emf.ecore;visibility:=reexport,
				 org.eclipse.core.runtime
 				""".formatted(config.projectName(), config.projectName()));

		Files.copy(modelPath.resolve(config.modelName() + ".ecore"), modelDir.resolve(config.modelName() + ".ecore"), StandardCopyOption.REPLACE_EXISTING);
		Files.copy(modelPath.resolve(config.modelName() + ".aird"), modelDir.resolve(config.modelName() + ".aird"), StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("=== Created new EMF project ===");
	}
}
