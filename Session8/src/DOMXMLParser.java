import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMXMLParser {

	public static void main(String[] args) {
		
		try {
			
			ArrayList<Student> students = new ArrayList<Student>();
			
			File file = new File("/Users/ishantkumar/Downloads/edureka-students.xml");
			
			// 1. Create a Document
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // Built in APIs and we got ways how to use them
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // This represents parsing of an XML File and we will have data in Document object
			
			System.out.println("Root Element in "+file.getName()+" is: "+document.getDocumentElement().getNodeName());
			
			// Lets get Elements by tag name which have tag as student
			NodeList nodes = document.getElementsByTagName("student");
			System.out.println(nodes.getLength()+ " student tags found in "+file.getName());
			
			for(int i=0;i<nodes.getLength();i++){
				Node node = nodes.item(i);
				Element element = (Element)node;
				
				/*String roll = element.getElementsByTagName("roll").item(0).getTextContent();
				String name = element.getElementsByTagName("name").item(0).getTextContent();
				String phone = element.getElementsByTagName("phone").item(0).getTextContent();
				String email = element.getElementsByTagName("email").item(0).getTextContent();
				String age = element.getElementsByTagName("age").item(0).getTextContent();
				
				System.out.println(roll+"-"+name+"-"+phone+"-"+email+"-"+age);*/
				
				Student sRef = new Student();
				sRef.roll = Integer.parseInt(element.getElementsByTagName("roll").item(0).getTextContent());
				sRef.name = element.getElementsByTagName("name").item(0).getTextContent();
				sRef.phone = element.getElementsByTagName("phone").item(0).getTextContent();
				sRef.email = element.getElementsByTagName("email").item(0).getTextContent();
				sRef.age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());
				
				students.add(sRef);
			}
			
			for(Student stu : students){
				System.out.println(stu); // Translated to -> System.out.println(stu.toString());
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}

	}

}
