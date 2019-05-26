
public class DataTypes {

	public static void main(String[] args) {
		
		// int means a storage container of 32 bits should be created in RAM
		// name of storage container is speed
		// = operator performs either write operation or update operation in container.
		// here = operator is writing data value 60 in speed container whose max size is 32 bits
		// 60 is data. we can call it as literal as well !!
		int speed = 60; // Create and write data in container speed
		
		speed = 80; // Update Operation. Old Value is removed and new value is written.
		
		//speed = 80, 100; // We cannot write more than 1 value : error
		// speed here, is a SINGLE VALUE CONTAINER
		
		byte age = 10;				// 8bits
		short num = 100;			// 16bits
		long phone = 9999900000l;	// 64bits, must put l/L in the end of data
		
		// Read Operation
		System.out.println("Speed is: "+speed); // Printed on Console > Speed is: 80
		
		// Decimal Values can also be stored :)
		float speedAgain = 60.67f;  
		double speedAgainAgain = 80.123;
		
		// Characters are created in single quotes ''
		char ch = 'A'; // We can store characters as well
		ch = 'B';
		ch = 85; 		// ASCII CODE
		ch = '\u0905'; 	// UNICODE, starts with blackslah u
		System.out.println("ch is: "+ch);
		
		boolean isInternetOn = false; // true
		System.out.println("Is Internet Connected: "+isInternetOn);

	} // when main will finished automatically containers will be deleted from memory
	
	

}
