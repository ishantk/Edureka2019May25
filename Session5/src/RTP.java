/*class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destinition){
		System.out.println(">> Cab Booked from "+source+" to "+destinition);
	}
}*/

// Refine RTP Architecture
// 1. Cab Objects are not required as they are not specifying which type of Cab
//    making a class as abstract, you cannot create its objects. i.e. It cannot be instantiated !!
//    Q: ? If we cannot create objects, why is constructor allowed ?? As we know constructor is executed on object construction !!
//    A:   We cannot create objects as users, but as per Rule, JVM will create its objects to fulfill Parent Child Relationship Rule
/*abstract class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// Eliminate definition of a method in abstract class by marking the method as abstract
	// abstract method has no definitions and can be created only in abstract class
	// abstract method is a RULE/Protocol created by Parent, which child must define 
	abstract void bookCab(String source, String destinition);
	// More than 1 abstract methods as per your choice
	// if we have n-abstract methods in parent abstract class, all these methods should be defined by children
	
	// non abstract methods i.e. regular methods are allowed
	void show(){
		System.out.println("this is show");
	}
}
*/

// Challenge: Even if we have refined our RTP Model i.e. we have created class as abstract
//			  We still get the Parent Cab Object in memory as per rule of inheritance :) which is of course waste of memory
// Solution:  To achieve RTP we can use interfaces which are not Parents !!

// interface is a RULE Book. Which object can implement !!
// If an object implements this rule book, it must define all the rules
// interface is not parent of any object. its just a rule book :)
interface Cab{
	// Interfaces cannot have constructors -> This means Interfaces Objects are not possible by us or by JVM
	/*Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// by default:  public abstract void bookCab(String source, String destinition);
	// This is also a RULE/Protocol but not by Parent Object !!
	void bookCab(String source, String destinition);
	
	
	// methods with definition not allowed
	/*void show(){
		System.out.println("this is show");
	}*/
}

// Hierarchy
class OLAMicro implements Cab{ //extends Cab{ // IS-A Relation
	OLAMicro(){ 
		System.out.println(">> OLA Micro Cab Object Constructed");
	}
	
	// this is a rule by parent, which child must define :)
	public void bookCab(String source, String destinition){
		System.out.println(">> OLA Micro Cab Booked from "+source+" to "+destinition);
	}
}

class OLAMini implements Cab{ //extends Cab{ // IS-A Relation
	
	OLAMini(){ 
		System.out.println(">> OLA Mini Cab Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> OLA Mini Cab Booked from "+source+" to "+destinition);
	}
}

class OLASedan implements Cab{ //extends Cab{ // IS-A Relation
	
	OLASedan(){ 
		System.out.println(">> OLA Sedan Cab Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> OLA Sedan Cab Booked from "+source+" to "+destinition);
	}
}


public class RTP {

	public static void main(String[] args) {
		
		//Cab cRef;
		//cRef = new Cab();
		
		/*
		OLAMicro oRef;
		oRef = new OLAMicro(); // Before Object of Child, Object of Parent will be Constructed (new OLAMicro() -> Object Construction)
		
		oRef.bookCab("Country Homes", "Pristine Magnum");
		*/
		
		// Rule #4 : Polymorphic Statement: Parent's Reference variable can refer to the Child Object.
		//Cab cRef; // Ref Variable of Cab i.e. Parent
		
		// Rule: Ref Var of Interface can refer to objects which implements it !!
		Cab cRef; // Ref Variable of Cab i.e. Interface
		cRef = new OLAMicro(); // cRef refers to OLAMicro Object :)
		
		// bookCab of Child will be executed and not of Parent -> Overriding
		cRef.bookCab("Country Homes", "Pristine Magnum"); 
		
		System.out.println();
		
		// Same Reference Variable can now point to some other child object
		cRef = new OLAMini();
		cRef.bookCab("Country Homes", "Pristine Magnum"); 
		
		System.out.println();
		
		cRef = new OLASedan();
		cRef.bookCab("Country Homes", "Pristine Magnum"); 
		
		// RTP : Run Time Polymorphism
		// 1. Same Ref Var cRef can point to OlaMicro, OlaMini and OlaSedan :) More than 1 forms
		// 2. Same bookCab method will be able to book different type of cab as per user's choice
		
		System.out.println();
		
		// If we create object of cab will it be of use ?
		//cRef = new Cab(); // Will this be of any use to us ??
		//cRef.bookCab("Country Homes", "Pristine Magnum"); // Will this be specifying what is the type of cab ??
		

	}

}
