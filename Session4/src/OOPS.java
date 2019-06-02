/*
 	// 1. Think of an Object: eg: User by Reading Project Requirements
	User:
		name
		phone
		email
		gender
		age
		address

 */
// 2. Draw the Object:
// Textual Representation how an Object will look like
// Whatever we write in User class, belongs to User Object.
// We are just defining how User Object will be in the memory !!
class User{

	// Attributes: Property of Object and not of Class
	String name;
	private String phone;
	String email;
	private int age;
	char gender;
	String address;

	// What so ever is private remains only in the object and cannot be accessed outside.
	
	// Methods: Property of Object and not of class
	// Setter Method : For phone attribute
	void setPhone(String p){ // non private  method which can be accessed outside
		if(p.length()>10){	 // We wish to put up a constraint/rule how to write in phone attribute 
			phone = p;
		}else{
			phone = "NA";
			System.out.println(">> Invalid Phone Number");
		}
	}

	// Getter Method : For phone attribute
	String getPhone(){
		return phone;
	}
	
	void setAge(int a){
		age = a; // If you wish you can put up some rules as per your requirements
	}
	
	int getAge(){
		return age;
	}
	
	// Method to write the data in User Object all together. can be any name of your choice.
	void setDataForUer(String n, String p, String e, int a, char g, String ad){
		name = n;
		phone = p;
		email = e;
		age = a;
		gender = g;
		address = ad;
	}
	
	void showUserDetails(){
		
		String salutation = "";
		
		if(gender == 'M'){
			salutation = "Mr. ";
		}else{
			salutation = "Ms. ";
		}
		
		System.out.println("====Details for: "+salutation+name+"====");
		System.out.println("Phone:\t"+phone);
		System.out.println("Email:\t"+email);
		System.out.println("Age:\t"+age);
		System.out.println("Gender:\t"+gender);
		System.out.println("Address:\t"+address);
		System.out.println("==========================");
	}
}

// Encapsulation : Making your data private in object so that no one can access it directly !!

// PS:  As of now attribute can be either private or non private i.e. default

public class OOPS { // OOPS is also a class. But this class contains main method
	
	// main is executed when we run our program.
	public static void main(String[] args) {
		
		int i = 10; // Single Value Container
		int[] arr = {10, 20, 30, 40, 50}; // Multi Value Container : Array, Indexed and Homogeneous
		
		//3. Create Object in Reality
		User uRef1 = new User(); // Object Construction Statement | Multi Value Container : Object, Attributes as keys and Hetrogeneous
		User uRef2 = new User();
		
		User uRef3 = uRef1; // Reference Copy
		
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		// uRef1 and uRef2 are reference variables and not Objects. They Refer to Object in Heap and contains hashCode of object.
		// new is a keyword which creates Objects.
		// new creates object when program is executed i.e. at Run Time and return HashCode of Object which we put in Ref Var
		
		
		// Operations on Object:
		// 1. Write or Update Operation. Done using reference variable with . operator and = operator
		uRef1.name = "John"; // This is write as for the first time we are putting the data for attribute/key called name
		//uRef1.phone = "+91 99999 88888";
		uRef1.setPhone("+91 99999 ");
		uRef3.email = "john@example.com";
		//uRef1.age = 30;
		uRef1.setAge(30);
		uRef1.gender = 'M';
		uRef3.address = "Redwood Shores"; 
				
		// Update
		uRef1.name = "John Watson";
		
		uRef2.name = "Fionna Flynn"; 
		//uRef2.phone = "+91 77777 88888";
		uRef2.setPhone("+91 77777 88888");
		uRef2.email = "fionna@example.com";
		//uRef2.age = 28;
		uRef2.setAge(28);
		uRef2.gender = 'F';
		uRef2.address = "Pristine Magnum"; 
			
		//2. Read Data from Object
		// Just Print out the data !!
		//System.out.println(">> "+uRef1.name+" is "+uRef3.age+" years old and lives in "+uRef1.address);
		//System.out.println(">> "+uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		System.out.println(">> "+uRef1.name+" is "+uRef3.getAge()+" years old and lives in "+uRef1.address);
		System.out.println(">> "+uRef2.name+" is "+uRef2.getAge()+" years old and lives in "+uRef2.address);
		
		System.out.println(">> "+uRef1.name+" can be called at "+uRef1.getPhone());
		System.out.println(">> "+uRef2.name+" can be called at "+uRef2.getPhone());
		
		// 3 Delete Operation
		// Performed by GarbageCollector in JVM automatically !!
		// System.gc(); // We can also execute Garbage Collector Forcefully !! But will delete those object which are no longer required !
		
		// Challenge : If we have to create n number of objects, we will write and read data which will be again a big job for developer
		// 			Writing data to individual property is difficult 
		// Solution : Lets create method in object so that we can write/read the data with it
		
		System.out.println();
		
		User uRef4 = new User();
		uRef4.setDataForUer("George", "+91 98765 98765", "george@example.com", 26, 'M', "Country Homes");
		uRef4.showUserDetails();
		
		System.out.println();
		uRef2.showUserDetails();
		
	}

}
