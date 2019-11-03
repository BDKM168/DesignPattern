package designpatterns.simplefactory;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtil {
    /*read the XML file and return the chart type's name */
    public static String getChartType() {
        try {
            //create a document object
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;							
            doc = builder.parse(new File("src//designpatterns//simplefactory//config.xml")); 
		
            //get the text node including chart type's name
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        }   
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
