package designpatterns.factorymethod;

//XMLUtil.java
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtil {
	//Extract a class name from XML file and create an instance by the name
	public static Object getBean() {
		try {
			//Create document object
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("src//designpatterns//factorymethod//config.xml")); 
		
			//get the text node including a class name
			NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
          
            //Create and return an instance
            Class c=Class.forName(cName);
	  	    Object obj=c.newInstance();
            return obj;
        }   
        catch(Exception e) {
         	e.printStackTrace();
         	return null;
        }
	}
}
