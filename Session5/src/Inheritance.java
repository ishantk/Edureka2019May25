
class Parent{
	
	// Attributes: Non Static : Property of Parent Object
	String fname;
	String lname;
	int vehicles;
	private int wealth; // is only accessible in the Parent Object
	
	// Attribute: Static : Property of Class
	static String businessName;
	
	// Constructor is executed whenever Object is created in memory
	Parent(){ 
		System.out.println(">> Parent Object Constructed");
	}
	
	// Non Static : Property of Object
	void showDetails(){
		System.out.println(">> "+fname+" "+lname+" has "+vehicles+" vehicles");
	}
	
	// Static : Property of Class
	static void showBusiness(){
		System.out.println(">> Business: "+businessName);
	}
}

class Child extends Parent{ // IS-A Relationship | Parent Child Relationship is created  | Parent -> Base Class | Child -> Derived Class
	
	// Attributes : Property of Child Object
	String fname; // fname is attribute of Child Object
	
	// Attributes : Property of Child Class
	static String businessName; // businessName is attribute of Child Class
	
	Child(){
		super.fname = "John"; // We can access Parent's Properties i.e. methods and attributes with super keyword
		System.out.println(">> Child Object Constructed");
	}
	
	// Overriding : Creating the same method with name and inputs in Child Object even if you have it in Parent Object
	void showDetails(){
		super.showDetails(); 
		System.out.println(">> "+fname+" "+lname+" has "+vehicles+" vehicles");
	}
	
	// Overloading : Method with different inputs
	/*void showDetails(int num){
		System.out.println(">> "+fname+" "+lname+" has "+vehicles+" vehicles");
	}*/
	
	
	// Static : Property of Class
	// Hiding : Creating the same method with name and inputs in Child Class even if you have it in Parent Class
	static void showBusiness(){
		System.out.println(">> Business: "+businessName);
	}
}

public class Inheritance {

	public static void main(String[] args) {

		//Parent pRef = new Parent(); 
		Child cRef = new Child(); // We will create object of Child !!
		System.out.println(">> cRef is: "+cRef);
		
		// Below Rules Applicable on Object to Object and Class to Class
		
		// Rule #1 : Parent Object will be constructed 1st and than the Child Object will be constructed
		// 			 Child Object will have Reference to the Parent Object by a keyword called super
		
		// Rule #2 : Child Object can access attributes and methods in the Parent Object :)
		//		     But if it is unavailable in Child Object
		
		// Rule #3 : Child cannot access private attributes or methods of Parent Object/Class
		
		cRef.fname = "George";	// Accessible from Child
		cRef.lname = "Watson";	// Accessible from Parent
		cRef.vehicles = 3;		// Accessible from Parent
		//cRef.wealth = 30000;  // error -> Private attributes/methods of Parent cannot be accessed
		//cRef.showDetails();	// Accessible from Parent till not available in Child
		cRef.showDetails();		// Accessible from Child as it is also available in Child Object
	
		 
		Child.businessName = "ABC International"; // We are now writing data in Child Class Attribute and Parent Class Attribute
		Child.showBusiness(); // But we accessing showBusiness of Parent
		
	}

}

/*
 
 	Inheritance
 	-----------
 	1. Object to Object : non static
 	2. Class to Class	: static
 	
 	Types of Inheritance
 	--------------------
 	
 	1. Single Level
	 	A
	 	|
	 	B
 	class A{}
 	class B extends A{}
 	
 	2. Multi Level
	 	A
	 	|
	 	B
	 	|
	 	C
 	class A{}
 	class B extends A{}
 	class C extends B{}
  	Parent -> Child -> GrandChild
  	If we create object of C, Object of B and Object of a will be constructed in memory !!
  	
  	3. Hierarchy
	  	A
	  	|
	  B   C
  	class A{}
 	class B extends A{}
 	class C extends A{}
 	
 	In Memory  -> A-B |  A-C | 2 A Objects will be created separately 1 for B and1 for C
 	
 	4. Hybrid
 	Mixture of Any combinations as listed above
	 	A
	 	|
	 	B
	 	|
	  C   D
	  	  |
	  	 E F
  	 
  	5. Multiple ==XX Not Supported in Java XX==
	  	A   B
	  	  |
	  	  C
  	  class A{}
  	  class B{}
  	  class C extends A,B{} // error -> Not Supported :)
  	    
 	
 */
