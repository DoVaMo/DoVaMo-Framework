package genModelGeneration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import com.google.gson.Gson;


/**
 * Class that provides a method for reading a genModel config file and for generating a genModel.
 */
public class GenModelGenerator {
	
	/**
	 * Reads the config file for the genmodel generation and generates a {@link GenModelConfig}.
	 * 
	 * @param pathToConfigFile the path to the config file
	 * @return a {@link GenModelConfig} with the data from the config file
	 * @throws IOException if the path to the config file is invalid or the config file is misformed
	 */
	public static GenModelConfig readGenModelConfigFile(Path pathToConfigFile) throws IOException {
		String fileContent = Files.readString(pathToConfigFile);
		Gson gson = new Gson();
		return gson.fromJson(fileContent, GenModelConfig.class);		
	}
	
	/**
	 * Adds a predefined body to a specified method of a {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel GenModel}
	 * 
	 * @param genModel the {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel GenModel} which contains the GenPackage in which the body should be added
	 * @param data the {@link MethodBodyData} containing the needed information to add the body
	 */
	private static void addBodyToMethod(GenModel genModel, MethodBodyData data) {
		GenPackage pckg = genModel.getAllGenPackagesWithClassifiers().stream().filter(it -> it.getNSName().equals(data.packageName())).findFirst().orElseThrow();
		GenClass genClass = pckg.getGenClasses().stream().filter(it -> it.getName().equals(data.className())).findFirst().orElseThrow();
		GenOperation operation = genClass.getGenOperations().stream().filter(it -> it.getName().equals(data.methodName())).findFirst().orElseThrow();
		operation.eSet(GenModelPackage.eINSTANCE.getGenOperation_Body(), data.body());
	}
	
	/**
	 * Adds a specified GenPackages into the used GenPackages of the given GenModel.
	 * With this, the GenPackage is declared as a dependency of the GenModel, but will be ignored during code generation
	 * For this, the XML of the GenModel is modified and the GenPackage is inserted into the usedGenPackages element.
	 * 
	 * @param genModelPath the path to the GenModel that should be modified
	 * @param usedGenPackageHref the reference to the GenPackage(s) that should be excluded
	 * @throws IOException if the path to the GenModel is invalid
	 */
	private static void excludeModelFromGeneration(String genModelPath, String usedGenPackagesHref) throws IOException, TransformerException, SAXException, ParserConfigurationException {
		//Parse the genmodel XML file contents
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File(genModelPath));

        Element root = doc.getDocumentElement(); // <genmodel:GenModel>

        //Create the element for the usedGenPackages
        Element usedGen = doc.createElement("usedGenPackages");
        usedGen.setAttribute("href", usedGenPackagesHref);
        root.appendChild(usedGen);

        //Save the modified genmodel again
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(false);
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(genModelPath));
        transformer.transform(source, result);
	}
	
	/**
	 * Adjusting the genmodel by setting the values specified in the config and some additional parameters (for example activating code formatting)  
	 * 
	 * @param genModel the {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel GenModel} that should be configured
	 * @param config the {@link GenModelConfig} containing the values that should be included in the genmodel
	 */
	private static void configureGenModel(GenModel genModel, GenModelConfig config) {
		//Set the values of attributes of the genModel to the values given in the config.
		genModel.setModelName(config.modelName());
        genModel.setModelDirectory(config.modelCodeDirectory());
        genModel.setEditDirectory(config.editCodeDirectory());
        genModel.setEditorDirectory(config.editorCodeDirectory());
        genModel.setTestsDirectory(config.testCodeDirectory());
        genModel.setModelPluginID(config.modelPluginID());
        genModel.setEditPluginID(config.editPluginID());
        genModel.setEditorPluginID(config.editorPluginID());
        genModel.setTestsPluginID(config.testsPluginID());
        
        //Setting the value for the extensibility features for each GenPackage
        if (config.activateExtensibilityFeatures()) {
        	for (GenPackage genPckg : genModel.getAllGenPackagesWithClassifiers()) {
        		genPckg.setExtensibleProviderFactory(true);
        		genPckg.setChildCreationExtenders(true);
        	}
        }
        
        //Setting some additional parameters for the genModel
        genModel.setImporterID("org.eclipse.emf.importer.ecore");
        genModel.setOperationReflection(true);
        genModel.setCodeFormatting(true);;
        genModel.setImportOrganizing(true);
        genModel.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
	}
	
	/**
	 * Method for creating a {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel GenModel} with the given configuration
	 * that will then be saved as a .genmodel file at a given location.
	 * 
	 * @param config the {@link GenModelConfig} containing the configuration for the genModel that should be created
	 * @throws IOException if the values in the config are invalid
	 */
	public static void createGenModel(GenModelConfig config) throws IOException {
    	System.out.println("=== Creating a genmodel ===");
		System.out.println("Config: " + config.toString());
		
		Path pathToModelFolder = Paths.get(config.pathToModelFolderFromGeneratingProject());
        // Register file extensions
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());

        // Load the .ecore model
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        Path absoluteEcorePath = pathToModelFolder.resolve(config.modelName() + ".ecore").toAbsolutePath();
        URI ecoreFileURI = URI.createFileURI(absoluteEcorePath.toString());
		
        
		// This line could be a problem when the code is not executed within Eclipse, but is needed when executed within eclipse
        URI logicalURI = URI.createURI("platform:/resource/%s/%s.ecore".formatted(config.localModelPath(), config.modelName()));

        // This maps logical -> physical
        // Logical URI is the URI that the genmodel-file should use and the physical URI is the URI for the relative path from this file used for storing.
        resourceSet.getURIConverter().getURIMap().put(logicalURI, ecoreFileURI);

        // Load using the logical URI
        Resource ecoreResource = resourceSet.getResource(logicalURI, true);
        
        //Create the genModel and set its source to the metamodel's EPackage
        EPackage rootPackage = (EPackage) ecoreResource.getContents().get(0);		
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
        genModel.getForeignModel().add(config.modelName());
        genModel.initialize(Collections.singleton(rootPackage));
        
        configureGenModel(genModel, config);
        
        // Adding predefined method bodies
        for (MethodBodyData bodyData : config.predefinedBodies()) {
        	addBodyToMethod(genModel, bodyData);
        }

        GenPackage genPackage = (GenPackage)genModel.getGenPackages().get(0);
        genPackage.setPrefix(config.modelName());

        URI genModelURI = URI.createFileURI(pathToModelFolder.resolve(config.modelName() + ".genmodel").toString());
        final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
        genModelResource.getContents().add(genModel);
        genModelResource.save(Collections.EMPTY_MAP);

        
        // Excluding GenPackages from code generation
        if (!config.excludedGenPackagesPaths().isEmpty()) {
        	String pathToGenModel = pathToModelFolder.resolve(config.modelName() + ".genmodel").toAbsolutePath().normalize().toString();
        	
            StringBuilder excludedPackagesPaths = new StringBuilder();
            excludedPackagesPaths.append(config.excludedGenPackagesPaths().get(0));
            //For multiple excluded GenPackages, they are listed in the genmodel file by separating them with whitespaces
            for (int i = 1; i < config.excludedGenPackagesPaths().size(); i++) {
            	excludedPackagesPaths.append(' ');
            	excludedPackagesPaths.append(config.excludedGenPackagesPaths().get(i));
            }
            try {
    			excludeModelFromGeneration(pathToGenModel, excludedPackagesPaths.toString());
    		} catch (IOException | ParserConfigurationException | SAXException | TransformerException e) {
    			System.err.println("Something went wrong while excluding GenPackages from creation");
    			e.printStackTrace();
    		}
        }
        System.out.println("=== Created a new genmodel ===");
    }
}

