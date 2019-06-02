// Textual Representation of Counter Object
// Nothing belongs to class, everything belongs to Object
class Counter{
	
	int count; 
	static int scount;
	
	Counter(){
		count = 1;
		scount = 1;
	}
	
	void incrementCount(){
		count++;
		scount++;
	}
	
	void showCount(){
		System.out.println(">> count is: "+count+" scount is: "+scount);
	}
}
// SOLVE THE PROBLEM !!
public class OOPSQuiz {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();	// c1/c3 1
		Counter c2 = new Counter(); // c2	 1
		Counter c3 = c1;			// Reference Copy
		
		// c1, c2 and c3 are reference variables which points to objects.
		// We have only 2 objects of Counter. c1 and c3 refers to the same object
		
		c1.incrementCount();	// c1/c3 	2
		c2.incrementCount();	// c2 		2
		c3.incrementCount();    // c1/c3	3
		
		c1.incrementCount();	// c1/c3	4
		c2.incrementCount();	// c2		3
		
		c1.showCount();	// >> count is: 4 
		c2.showCount(); // >> count is: 3 
		c3.showCount(); // >> count is: 4 
	}

}
