final class CA{
	final void show(){
		System.out.println("show of CA");
	}
	
	// Allowed : Overloading
	void show(int x){
		System.out.println("show of CA");
	}
}

class CB{ //extends CA{ we cannot extend a final class
	
	// We cannot override a final method
	/*void show(){
		System.out.println("show of CB");
	}*/
}

public class FInalKeyword {

	public static void main(String[] args) {
		
		//int number = 10;
		//number = 100; // OK. Modification Allowed

		// We cannot change it
		final int number = 10;
		//number = 100; // Err. Modification not allowed on final container. It becomes constant or Read Only !!
	}

}
