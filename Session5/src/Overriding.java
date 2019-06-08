class Father{
	
	public void vehicleDetails(){ // public is accessible everywhere (most accessible)
		System.out.println(">> Vehicle is a Maruti Suzuki Swift Car");
	}
	
}

class Son extends Father{
	
	// Re-Define a similar method which is in Father i.e. Parent or Base Object
	// Overriding : Same Signature
	public void vehicleDetails(){ 
		System.out.println(">> Vehicle is a Honda City Car");
	}
	
}

public class Overriding {

	public static void main(String[] args) {
	
		Son sRef = new Son();
		sRef.vehicleDetails(); // if method is unavailable in Child, it will access its Parent's method
		// if Child Object has defined its own version, Child's version shall be executed

		// Rule to Override:
		// Signature should be same and access modifier of Child's method should be either same or greater than Parent's method
		// Access should be same or more than Parent
	}

}
