package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Class that offers functionalities for dealing with files
 */
public class FileUtils {
	
	/**
	 * Method that extracts the content of a XML tag
	 * 
	 * @param pathToFile the path to the XML file
	 * @param tag the name of the tag whose content should be extracted
	 * @return the extracted content
	 * @throws IOException if the path is invalid
	 */
	public static String extractXMLTagContent(Path pathToFile, String tag) throws IOException {
		String fileContent = Files.readString(pathToFile);
		if(!fileContent.contains("<%s>".formatted(tag))) {
			throw new IOException("The file at %s did not contain the tag %s".formatted(pathToFile.toString(), tag));
		}
		
		return fileContent.split("<%s>".formatted(tag))[1].split("</%s>".formatted(tag))[0];
	}

	
	/**
	 * Method that adds a given folder as a src folder to a project by editing the .classpath file.
	 * 
	 * @param projectPath the path to project where the folder should be added
	 * @param folderName the name of the folder
	 * @throws Exception if the paths are invalid or something goes wrong with the transformation
	 */
	public static void makeSrcFolderInProject(String projectPath, String folderName) throws Exception {
		File classpathFile = Paths.get(projectPath, ".classpath").toFile();
        if (!classpathFile.exists()) {
            throw new IllegalStateException(".classpath file not found at " + classpathFile.getAbsolutePath());
        }

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(classpathFile);
        doc.getDocumentElement().normalize();

        NodeList entries = doc.getElementsByTagName("classpathentry");
        boolean hasSrcGen = false;

        for (int i = 0; i < entries.getLength(); i++) {
            Element entry = (Element) entries.item(i);
            if ("src".equals(entry.getAttribute("kind")) &&
                folderName.equals(entry.getAttribute("path"))) {
                hasSrcGen = true;
                break;
            }
        }

        if (!hasSrcGen) {
            Element newEntry = doc.createElement("classpathentry");
            newEntry.setAttribute("kind", "src");
            newEntry.setAttribute("path", folderName);

            Node classpath = doc.getElementsByTagName("classpath").item(0);
            classpath.appendChild(newEntry);

            // Write back to file
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            try (FileOutputStream out = new FileOutputStream(classpathFile)) {
                StreamResult result = new StreamResult(out);
                transformer.transform(source, result);
            }
            System.out.println("Added folder to .classpath in " + projectPath);
        } else {
            System.out.println("folder already present in .classpath");
        }
	}
	
	/**
	 * Extracts the lowest directory in a path.
	 * 
	 * @param path the string of the path that should be processed
	 * @param the lowest directory in the given path
	 */
	public static String extractLowestDirectory(String path) {
		if (path.endsWith("/")) {
			return extractLowestDirectory(path.substring(0, path.length() - 1));
		}
		int indexOfLastDelimiter = path.lastIndexOf("/");
		
		return path.substring(indexOfLastDelimiter + 1);
		
	}
	
	/**
	 * Extracts the lowest directory in a path.
	 * 
	 * @param path the string of the path that should be processed
	 * @param the lowest directory in the given path
	 */
	public static String extractTopDirectory(String path) {
		if (path.startsWith("/")) {
			return extractTopDirectory(path.substring(1, path.length()));
		}
		
		int indexOfFirstDelimiter = path.indexOf("/");
		
		return path.substring(0, indexOfFirstDelimiter);		
	}
	
}