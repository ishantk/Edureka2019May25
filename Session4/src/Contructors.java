// Textual Representation of an Object which is a 2-D Point
class Point{
	
	// Attributes: Property of Object
	int x;
	int y;
	
	// Constructors
	// is a method whose name is same as that of class name
	// has no return type eg: void
	// We need constructors so that we can write some default values for our attributes
	// Use Case: In Settings of our Phone we see default values for brightness, volume, ringtones etc...
	Point(){ // Default Constructor / No Args Constructor / No Input Constructor
		x = 10;
		y = 10;
	}
	
	// Inputs to Constructor may be same name as that of Attributes
	Point(int x, int q){ // Parameterized Constructor / Args Constructor / Input Constructor
		this.x = x;
		y = q;
		// LHS this.x -> Object's Attribute
		// RHS x -> Point Constructor's Input
	}
	
	// this is a reference variable which shall point to current object
	// this.x is attribute of Object and x is input of Construtor/Method
	
	// Methods: Property of Object
	// Inputs to Method may be same name as that of Attributes
	void setPointDetails(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void showPoint(){
		System.out.println(">> Point is: "+x+" : "+y);
	}
}


public class Contructors {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point(); // Point(); -> Execution of Constructor
		Point p4 = new Point(20, 30); // Put Data at the time of Object Construction
		
		// Writing Data in Object Directly
		p1.x = 10;
		p1.y = 20;
		
		// Writing Data in Object Indirectly with methods
		p2.setPointDetails(30, 70);
		p1.setPointDetails(11, 22);
		
		// Executing Method to Get the Data Displayed
		p1.showPoint();
		p2.showPoint();
		p3.showPoint(); //We didnt set data for Point Objects referenced by p3. So we got 0 and 0 as output
		p4.showPoint();

	}

}
