// Use Case : eCommerce Platform where we have so many different Products
/*
class MobilePhone{
	
	// Attributes : MobilePhone Object
	int pid;
	String name;
	String brand;
	int price;
	String ram;
	String os;
	int memory;
}

class Shoe{
	
	// Attributes : Shoe Object
	int pid;
	String name;
	String brand;
	int price;
	int size;
	String color;
}

class LEDTV{
	
	// Attributes : LEDTV Object
	int pid;
	String name;
	String brand;
	int price;
	int screenSize;
	String technology;
}
*/
// PS : MobilePhone, Shoe and LEDTV Share some common Attributes !! :)  | pid, name, brand and price :)

// Common Code is shifted in Parent Class
// And hence, we use Inheritance Rules further for our executions !!
// Elimination of Code Redundancy
class Product{
	
	// Attributes : Product Object
	int pid;
	String name;
	String brand;
	int price;
}

class MobilePhone extends Product{ // MobilePhone IS-A Product
	
	// Attributes : MobilePhone Object
	String ram;
	String os;
	int memory;
}

class Shoe extends Product{
	
	// Attributes : Shoe Object
	int size;
	String color;
}

class LEDTV extends Product{
	
	// Attributes : LEDTV Object
	int screenSize;
	String technology;
}



public class WhyInheritance {

	public static void main(String[] args) {
		
	}

}
