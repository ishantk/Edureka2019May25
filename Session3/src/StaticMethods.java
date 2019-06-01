
public class StaticMethods {

	// Non Static Methods: As they have no static keyword in front of them
	void sayHello(){
		System.out.println(">> Hello All");
	}
	
	void sayBye(){
		System.out.println(">> Bye All");
	}
	
	// Static Methods : What are they? will be explored later.
	// But for today : write static keyword in font of them
	
	static void showQuote(){
		System.out.println(">> Search the candle rather than cursing the Darkness !!");
	}
	
	public static void main(String[] args) {
		
		// We need an Object to Execute the methods:
		StaticMethods mRef = new StaticMethods(); // Instantiation | Object Construction
		mRef.sayHello();
		mRef.sayBye();
		
		// static methods can also be executed with ref var of Object
		mRef.showQuote(); // But not recommended
		
		// static methods must be execute with Class Name
		StaticMethods.showQuote();
		
		// * if main and static methods are in same class, we can directly execute them
		// like below:
		showQuote(); // *
		
		// PS:
		// non static methods have to do something with Objects thats why we need an Object construction statement for them
		// static methods have to do something with class thats why we used class name directly
	}

}
