
public class MethodMemoryManagement {

	// When a method is executed its stack area is temporarily allocated to it for storing its variables.
	// When execution finishes, memory is deleted !!
	void computeWholeSquare(int a, int b){
		// a, b and c  are property of computeWholeSquare method
		int c = a*a + b*b + 2*a*b;
		System.out.println(">> Result is: "+c);
	}
	
	// Whatever we write in main, is executed in a sequence
	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		// num1 and num2 are property of main method
		int num1 = 10;
		int num2 = 20;
		
		// Object Construction Statement
		MethodMemoryManagement mRef = new MethodMemoryManagement();
		mRef.computeWholeSquare(num1, num2); // We are Executing the Method : computeWholeSquare
		
		// Line# 21 is execution of method computeWholeSquare
		// Control will be transfered to the method computeWholeSquare from main and when computeWholeSquare 
		// finishes its execution control comes back to the main
		
		System.out.println(">> App Finished");
		
		// Method Execution happens on Stack Memory !!
		// Method Execution Stack !!
		
	}

}
