import java.util.Scanner; // import statement to import a built in Class

public class UserInput {
	
	static void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println(">> sum of "+num1+" and "+num2+" is: "+num3);
	}

	public static void main(String[] args) {
		
		// Create Object of Scanner and Pass System.in as input to it to Read from Console.
		Scanner anyName = new Scanner(System.in); // System.in is to read from Console. System.out is to write in Console
		System.out.println(">> Enter Num1: ");
		int num1 = anyName.nextInt(); // nextInt method is a predefined method of scanner and will read integer on console
		System.out.println(">> Enter Num2: ");
		int num2 = anyName.nextInt();
		
		UserInput.addNumbers(num1, num2); // Using Method to add numbers. can be static or non static as per your choice
		
		anyName.close(); // Cleans Memory Resources
	}

}
