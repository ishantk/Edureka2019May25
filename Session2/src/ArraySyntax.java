
public class ArraySyntax {

	public static void main(String[] args) {
		
		int num = 10; 						// SVC
		int[] nums = {10, 20, 30, 40, 50}; 	// MVC (Array of ints)
		
		System.out.println("num is: "+num);		// 10
		System.out.println("nums is: "+nums);	// HashCode in hexa decimal notation
		
		// nums is a reference variable which shall hold HashCode of Array :)
		// Array is created in Heap Area
		// Array shall be created at RUN TIME i.e. when program will execute
		
		// 1. Bracket [] before
		int[] a1 = {10, 20, 30, 40, 50}; 		// Implicit Syntax | int[] a1 = {10, 20, 30, 40, 50};  -> int[] a1 = new int[]{10, 20, 30, 40, 50}; | Compiler shall translate the statement 
		
		// 2. Bracket [] after
		int a2[] = {10, 20, 30, 40, 50};
		
		// 3. new keyword
		int[] a3 = new int[]{10, 20, 30, 40, 50}; // Explicit Syntax
		
		// 4. with size : all elements shall be 0
		int[] a4 = new int[10]; // create an array of 10 integers with each element having 0 as value
		// a4 is indexed from 0 to 9
		
		System.out.println("a1 is "+a1+" and length is: "+a1.length);
		System.out.println("a2 is "+a2+" and length is: "+a2.length);
		System.out.println("a3 is "+a3+" and length is: "+a3.length);
		System.out.println("a4 is "+a4+" and length is: "+a4.length);
		
		// Read Data from Array
		// Read single element:
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a3[1]);
		System.out.println(a4[5]); // if you access element which is out of range you get error at run time -> exception
		
		// Write/Update element
		a1[0] = 11;
		a2[0] = 111;
		a3[1] = 222;
		a4[5] = 18;
		a4[7] = 20;
		
		System.out.println(">> Re-Reading");
		
		// Re-Read the elements now:
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a3[1]);
		System.out.println(a4[5]);	
		
		// Read All the elements
		System.out.println(">> Reading a1 elements:");
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+"  ");
		}
		System.out.println();
		
		System.out.println(">> Reading a2 elements:");
		for(int i=0;i<a2.length;i++){
			System.out.print(a2[i]+"  ");
		}
		System.out.println();
		
		System.out.println(">> Reading a3 elements:");
		for(int i=0;i<a3.length;i++){
			System.out.print(a3[i]+"  ");
		}
		System.out.println();
		
		System.out.println(">> Reading a4 elements:");
		for(int i=0;i<a4.length;i++){
			System.out.print(a4[i]+"  ");
		}
		System.out.println();
		
		char[] chArr = new char[5];
		chArr[0] = 'H';
		chArr[2] = 'I';
		
		for(int i=0;i<chArr.length;i++){
			System.out.print(chArr[i]+"  ");
		}
		System.out.println();
		
		// Reading Arrays with a special for loop -> ENHANCED FOR LOOP or FOR-EACH LOOP
		System.out.println(">> Reading with enhanced for loop");
		for(int elm : a4){ // it shall work only with arrays as of now :)
			System.out.print(elm+"  ");
		}
		System.out.println();
	}

}

// PS: Arrays are Multi Value Containers to store lot of data in indexed approach
//     Arrays are created in Heap Area
//     a1, a2, a3, a4 are Reference Variables and not Arrays. They container HashCode of Array !!
