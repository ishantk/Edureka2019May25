class Student{
	
	// Attributes: Property of Object
	int roll;
	String name;
	
	//String teacherName; // We may have an attribute whose value will be same for all objects !!
	// such an attribute is repeated in all the objects leading more memory usage
	
	// Static Attributes : Property of Class and not of Object :)
	static String teacherName;
	
	// Method: Property of Object
	void showStudentDetails(){
		// Property of Object (showStudentDetails method) can access Property of Class (teacherName)
		System.out.println(">> "+roll+" Roll Number belongs to "+name+" and is taught by "+teacherName);
	}
	
	static void showTeacherDetails(){
		System.out.println(">> Teacher: "+teacherName);
	}
}


public class StaticKeyword {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.roll = 101;
		s1.name = "John";
		
		s2.roll = 102;
		s2.name = "Fionna";
		
		// Access i.e. Read and Write Data for static with Class Name as it is property of Class
		// But Property of Class can be accessed by Object / Object's References
		Student.teacherName = "George";
		
		s1.showStudentDetails();
		s2.showStudentDetails();
		
		s1.teacherName = "Bob Williams";
		
		Student.showTeacherDetails();
		s1.showTeacherDetails();
		s2.showTeacherDetails();

	}

}
