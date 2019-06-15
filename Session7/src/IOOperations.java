import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Student{
	
	// Attributes: Property of Object
	int roll;
	String name;
	int age;
	
	Student(){
		roll = 0;
		name = "NA";
		age = 0;
	}
	
	Student(int roll, String name, int age){
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
	String toCSV(){
		return roll+","+name+","+age+"\n";
	}
}

class FileHelper{
	
	void writeInFile(String text){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edureka-students.csv");
			
			// FileWriter writes the data in text format
			
			//FileWriter writer = new FileWriter(file); 	// It will overwrite the old file
			FileWriter writer = new FileWriter(file, true); // true -> Append Mode Enabled. 
			writer.write(text);
			writer.close(); // close the stream to release memory resources
			System.out.println(">> Data Written in File "+file.getName());
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	void writeInFileAgain(String text){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edureka-students-again.csv");
			
			// FileOutputStream writes the data in bytes 
			
			//FileOutputStream stream = new FileOutputStream(file);		// It will overwrite the old file
			FileOutputStream stream = new FileOutputStream(file, true); // true -> Append Mode Enabled. 
			stream.write(text.getBytes());
			
			System.out.println(">> Data Written in File "+file.getName());
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edureka-students.csv");
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // to read data line by line
			//reader.read(); // Reads character by character :)
			String line = "";
			
			while((line = buffer.readLine()) !=null){
				System.out.println(line);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	void readFromFileAgain(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edureka-students-again.csv");
			FileInputStream stream = new FileInputStream(file); // Here we need to read byte by byte
			
			int c = 0;
			
			while((c = stream.read()) !=-1 ){ // -1 means end of file here
				char ch = (char)c;
				System.out.print(ch);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
}

public class IOOperations {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "John", 20);
		Student s2 = new Student(2, "Jennie", 22);
		Student s3 = new Student(3, "Fionna", 24);
		
		/*
		System.out.println(s1.toCSV());
		System.out.println(s2.toCSV());
		System.out.println(s3.toCSV());
		*/
		
		FileHelper helper = new FileHelper();
		//helper.writeInFile(s1.toCSV());
		//helper.writeInFile(s3.toCSV());
		
		//helper.writeInFileAgain(s1.toCSV());
		//helper.writeInFileAgain(s2.toCSV());
		//helper.writeInFileAgain(s3.toCSV());
		
		//helper.readFromFile();
		helper.readFromFileAgain();

	}

}
