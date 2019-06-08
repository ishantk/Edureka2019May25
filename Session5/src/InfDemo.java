interface Inf1{
	
	int num = 10;	// public static final int num = 10; // static -> Property of Interface and cannot be modified
	
	void show();	//public abstract void show();
	void hello();	//public abstract void hello();
}

interface Inf2{
	
	void show();	//public abstract void show();
	void bye(String name);		//public abstract void bye();
}

// We say, Multiple Inheritance is not supported in Java-> class C extends A,B{} // error
// But wit interfaces Multiple Inheritance is supported. But what exactly is this ??
// Interface to Interface Inheritance !!
interface Inf3 extends Inf1, Inf2{
	
}


// Multiple Implementation and not Multiple Inheritance/Extension
class CX implements Inf3{//Inf1, Inf2{ // Multiple Implementation is 1 object implementing multiple rule books. Here Object has no Parent !!
	
	public void show(){ // has to be defined only once
		System.out.println(">> show in CX");
	}
	
	public void hello(){
		System.out.println(">> hello in CX");
	}

	public void bye(String name){
		System.out.println(">> bye in CX to "+name);
	}
	
}

public class InfDemo {

	public static void main(String[] args) {
		
		// Polymorphic Statement:
		// Reference Variable of Interface can point to Object which implements it !!
		
		/*
		Inf1 iRef1 = new CX();
		iRef1.show();
		iRef1.hello();
		//iRef1.bye("John"); // error
		
		System.out.println();
		
		Inf2 iRef2 = new CX();
		iRef2.show();
		//iRef2.hello(); error
		iRef2.bye("John");
		
		System.out.println(">> num is: "+Inf1.num);
		*/
		
		Inf3 iRef3 = new CX();
		iRef3.show();
		iRef3.hello();
		iRef3.bye("John");
		
		System.out.println(">> num is: "+Inf3.num);
	}

}

// PS: 1. Object to Object (non static) 
//     2. Class to Class   (static)
//     3. Interface to Interface (abstract methods and final attributes)
