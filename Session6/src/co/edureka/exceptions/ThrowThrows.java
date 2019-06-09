package co.edureka.exceptions;

// Creating a User-Defined (Customized) UNCHECKED Exception :)
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message); // Pass the message to Parent's Constructor
	}
}

// Creating a User-Defined (Customized) CHECKED Exception :)
// Other than RuntimeException all classes are Checked Exceptions !!
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message); // Pass the message to Parent's Constructor
	}
}

class BankAccount{
	
	int balance = 10000;
	int attempts = 0;
	
	void withdraw(int amount) throws YourBankingException{
		balance = balance - amount;
		if(balance < 0){
			balance = balance + amount;
			System.out.println(">> Low Balance \u20b9"+balance+" You Cannot Withdraw !!");
			attempts++;
		}else{
			System.out.println(">> Withdrawl Finished. New Balance is \u20b9"+balance);
		}
		
		// Check for 3 UnSuccessfull attempts
		if(attempts == 3){
			// Create Object of Exception
			// This is Object of ArithmeticException which is Child of RuntimeException i.e. UnChecked Exception
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts !!");
			//throw aRef; // We are crashing the program ourselves by throwing an UNCHECKED ECEPTION
			
			// Throwing a User Defined UNCHECKED EXCEPTION
			//MyBankingException mRef = new MyBankingException("Illegal Attempts !!");
			//throw mRef;
			
			// Throwing a User Defined CHECKED EXCEPTION
			YourBankingException yRef = new YourBankingException("Illegal Attempts !!");
			throw yRef; // compiler will give error in case of CHECKED EXCPETIONS
		}
	}
	
}

// throw keyword will help us to throw error in our program to crash the program !!

public class ThrowThrows {

	public static void main(String[] args) {

		System.out.println(">> Banking Started");

		BankAccount bRef = new BankAccount();
		
		// If user is trying multiple times for balance which cannot be withdrawn. Is it ok ?? Is thr any Challenge here ??
		// Basically, Bank's Resources will be occupied !! -> Problem !!
		try{
			for(int i=1;i<=100;i++){
				bRef.withdraw(3000);
			}
		}catch(Exception e){
			System.out.println(">> Some Exception: "+e);
		}
		
		System.out.println(">> Banking Finished");
	}

}

// 1. Why we need to crash the Program ?
// 2. What is throw keyword
// 3. User Defined Exception 
// 4. Checked Vs UnChecked
// UnChecked Exceptions compiler will not care !! But for Checked Exceptions compiler will give error to put throws and handle in try catch blocks
// 5. try, catch, finally, throw and throws :)