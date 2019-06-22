package co.edureka;

public class Customer {

	// Attributes : Property of Object
	int id;
	String name;
	String phone;
	String email;
	
	Customer(){
		id = 0;
		name = "NA";
		phone = "NA";
		email = "NA";
	}
	
	Customer(String name, String phone, String email){
		// this is a reference variable which will point to current object
		// this.name which is LHS represents attribute of object and name which is RHS is Constructor's Input
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	void showCustomerDetails(){
		System.out.println(">> Customer Details: "+name+" | "+phone+" | "+email);
	}
}
