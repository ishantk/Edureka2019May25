import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XMLWriter {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "John", "+91 99999 88888", "john@example.com", 20);
		//Student s2 = new Student(2, "Fionna", "+91 77777 88888", "fionna@example.com", 22);
		//Student s3 = new Student(3, "Leo", "+91 99999 66666", "leo@example.com", 24);
		
		System.out.println(s1); // translated to -> System.out.println(s1.toString());
		//System.out.println(s2);
		//System.out.println(s3);
		
		// Challenge  : Data is available in Objects and Objects are created in RAM
		//			    When Program will end, data in Objects will be lost.
		//			    We need to save data in 
		// 			    1. Files -> Plain Files		 | Store Data without any standard :)
		//			    2. XML Files -> Standard Way | Store Data in Tags :)
		// 				3. DataBases -> MySQL/Oracle | Store Data in Tables :)
		
		// We will see programtically how we can generate XML File
		
		try {
			
			// 1. Create a Document
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // Built in APIs and we got ways how to use them
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // This represents an XML File :)
			
			// 2. Create Tags known as Elements
			Element elmRoot = document.createElement("students");
			Element elmStudent = document.createElement("student");
			Element elmRoll = document.createElement("roll");
			Element elmName = document.createElement("name");
			Element elmPhone = document.createElement("phone");
			Element elmEmail = document.createElement("email");
			Element elmAge = document.createElement("age");
			
			// 3. Create Data for Tags know as Text 
			Text txtRoll = document.createTextNode(String.valueOf(s1.roll)); // convert int to String
			Text txtName = document.createTextNode(s1.name);
			Text txtPhone = document.createTextNode(s1.phone);
			Text txtEmail = document.createTextNode(s1.email);
			Text txtAge = document.createTextNode(String.valueOf(s1.age));

			// 4. Append Data i.e. Text in Tags i.e. Elements
			elmRoll.appendChild(txtRoll);
			elmName.appendChild(txtName);
			elmPhone.appendChild(txtPhone);
			elmEmail.appendChild(txtEmail);
			elmAge.appendChild(txtAge);
			
			elmStudent.appendChild(elmRoll);
			elmStudent.appendChild(elmName);
			elmStudent.appendChild(elmPhone);
			elmStudent.appendChild(elmEmail);
			elmStudent.appendChild(elmAge);
			
			elmRoot.appendChild(elmStudent);
			
			document.appendChild(elmRoot);
			//document.createAttribute() | Explore in case you need Attributes in XML !!
			
			// 5. Transformer API will Use DOMSource and StreamResult to generate XML File !!
			
			// Source which needs to be written in XML File
			DOMSource source =  new DOMSource(document); 
			
			// Destination: Where to save data !!
			File file = new File("/Users/ishantkumar/Downloads/edureka-students-again.xml");
			FileOutputStream stream = new FileOutputStream(file);
			StreamResult result = new StreamResult(stream);
			
			//TransformerFactory tFactory = TransformerFactory.newInstance();
			//Transformer transformer = tFactory.newTransformer();
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			
			transformer.transform(source, result);
			System.out.println(">> XML File Written");
			
		} catch (Exception e) {
			System.out.println(">> Exception is: "+e);
		}
		
	}

}
