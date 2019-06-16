
public class Student {
	
	// Attributes: Property Of Object
	int roll;
	String name;
	String phone;
	String email;
	int age;

	public Student() {
	
	}

	public Student(int roll, String name, String phone, String email, int age) {
		this.roll = roll;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}

	// Overrided from Object class : Object class is parent to all the classes in Java. either built in classes or user defined classes
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", phone=" + phone + ", email=" + email + ", age=" + age
				+ "]";
	}
	
}
