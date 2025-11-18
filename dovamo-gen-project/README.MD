# Project + GenModel Generation
This module contains the functionality to generate new Eclipse Plugin Projects, new Maven Modules or new GenModels.

## EMF Modeling Project Generation
The creation of EMF Modelling Projects is implemented in the class [`EMFProjectGenerator`](./src/main/java/emfProjectGeneration/EMFProjectGenerator.java).
For creating a project, the method `createEMFProject` is called with an [`EMFProjectConfig`](./src/main/java/emfProjectGeneration/EMFProjectConfig.java).
This config can be read from a config JSON with the `readEMFProjectConfigFile` method. 
An example of such a file can be found [here](./emfProjectConfig.json).
The create method creates a new folder at the specified location with the given name and then adds predefined files like the .classpath or the MANIFEST.MF file. Then, an ecore metamodel is copied into the model folder from another specified location.

## Maven Module Project Generation
The creation of Maven Modules is implemented in the class [`MavenModuleGenerator`](./src/main/java/mavenModuleGeneration/MavenModuleGenerator.java).
For creating a project, the method `createMavenModule` is called with a [`MavenModuleConfig`](./src/main/java/mavenModuleGeneration/MavenModuleConfig.java).
This config can be read from a config JSON with the `readMavenModuleConfigFile` method.
An example of such a file can be found [here](./mavenModuleConfig.json).
The create method creates a new maven module in the predefined maven project at the specified location with the given name and then adds predefined files like the pom.xml and directories like src. Then, an ecore metamodel is copied into the model folder from another specified location and the pom.xml of the parent maven project is modified.

## GenModel Generation
The creation of GenModels is implemented in the class [`GenModelGenerator`](./src/main/java/genModelGeneration/GenModelGenerator.java)
For creating a genmodel the method `createGenModel` is called with a [`GenModelConfig`](./src/main/java/genModelGeneration/GenModelConfig.java).
This config can be read from a config JSON with the `readGenModelConfigFile` method.
An example of such a file can be found [here](./emfProjectGenModelConfig.json).
The create method first resolves the ecore metamodel at the given path. Then, the EPackage of the metamodel is loaded and a basic genmodel is created for this EPackage. Afterwards, the generated GenModel object is further configured, which is described in the following:

#### Directory of the model, edit, editor and test code  
These directories are set via the setter functions of the genmodel object to the values given in the config file. Also, the plugin IDs for the 4 components are set to the values given in the config file. Since they need to be identical to the name of the project containing the folder in which the code is created, the values of the plugin ID need to match the paths specified in the config.

#### Defining method bodies for the code generation
Sometimes, we want to specify the implementation of a method that was modeled inside the metamodel.
If the bodies are predefined using a GenModel EAnnotation in the ecore metamodel, this annotation will automatically be transferred into the created genmodel.
If the implementation was not specified in the metamodel but should be added in the genmodel generation process, it can be added to the GenModel's config file. By using the key _predefinedBodies_, a list of predefined bodies can be passed with the format corresponding to the record class [`MethodBodyData`](./src/main/java/genModelGeneration/MethodBodyData.java). The exact method (package, class, name) and the body need to specified. Then, the body will be added to the method in the genmodel.

#### Specifying GenPackages which are excluded during the generation
There are case in which we don't want to create the code for certain packages that our metamodel references or defines. By default, all EPackages that are referenced or defined by the metamodel are part of the generation. Therefore, all EPackages, or rather GenPackages that should be excluded from generation, need to be explicitly specified. 
The packages that should be excluded can be defined via the genmodel config file, where for each GenPackage, the path needs to be specified. This can be done using the key _excludedGenPackagesPaths_ in the genmodel config file.
Then, the XML code of the previously generated genmodel is edited by inserting all the references to the excluded GenPackages as a new element called "usedGenPackages".
This tells the generated genmodel to exclude the specified GenPackages from code generation.

## Code Generation
The creation of GenModels is implemented in the class [`CodeGenerator`](./src/main/java/codeGeneration/CodeGenerator.java)
For creating a genmodel the method `generateCode` is called with a [`CodeGenerationConfig`](./src/main/java/codeGeneration/CodeGenerationConfig.java).
This config can be read from a config JSON with the `readCodeGenerationConfigFile` method.
An example of such a file can be found [here](./codeGenerationConfig.json).
The code is generated by loading an ecore metamodel and its genmodel into a ResourceSet and then creating a [Generator](org.eclipse.emf.codegen.ecore.generator.Generator).
For this Generator, the GenModel is set as a source.
Depending on the config, the model, edit, editor and test code is then generated.

### Pre-Loading the used GenPackages
When the Generator generates the code for a GenModel, it loads the GenModel and the ecore Model for the used GenPackages because it needs to resolve the data type of the attributes. 
However, it uses the path that is specified in the main GenModel for which the code should be generated. 
Since this is not the correct relative path as seen from the generation project, resolving the data type or rather loading the referenced GenPackage/GenModel fails. For this reason, we need to preload all the referenced usedGenPackages and map the incorrect path to the correct path so that when the Generator tries to reference the incorrect path it actually accesses the correct path.
This is done using absolute paths since EMF considers file URIs identical iff they are textually identical. 
Therefore, two URIs that are semantically the same, e.g. ./. and . are seen as unequal and can therefore not be resolved to the same thing by EMF.
When using absolute paths, however, they are also semantically the same iff they are textually identical (ignoring symlinks etc.). 
We also don't have to worry about compatibility issues between different machines since these paths are only used during the runtime of the code execution and are not persisted anywhere.