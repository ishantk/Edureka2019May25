package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started"); 			// 1st statement

		int[] arr = {10, 20, 30, 40, 50};
		
		int a=10,b=0,c=0; // We are going to divide by 0
		
		try{
			
			// By only writing instruction in try block will not solve the purpose. A corresponding catch should also be thr !!
			c = a/b; // if error occurs here, control will be shifted to catch block from here and below instructions in try will not be executed
			System.out.println(">> c is: "+c);
			
			System.out.println(">> arr[10] is: "+arr[10]);  // arr[10] is not available in array -> Throw an Error when we will run our program
		}catch(ArrayIndexOutOfBoundsException aRef){ // ArrayIndexOutOfBoundsException is a built in class which we need not to import
		//catch(Exception e){	 // Exception is Parent to all the Exception. As per Polymorphic Statements Parent's Ref Var can point to any Child Object
			System.out.println(">> Some Exception: "+aRef);
		}catch(ArithmeticException aRef){
			//System.out.println(">> ArithmeticException Exception i.e. Divide by Zero: "+aRef);
			aRef.printStackTrace(); // Give the details of error i.e. line numbers where error origintaed
		}
		finally{ // which will be executed for any case. Wether exception is handled or not finally will be executed
			System.out.println(">> This is finally block"); // We must write some important statements which we wish to be executed at any cost. eg: Some memory Cleanup Statements
		}
		
		System.out.println(">> App Finished");			// Last statement
		
		// Graceful Termination of our Application : When 1st and Last Statement is executed :)
		// Abnormal Termination  of our Application : When Last Statement is not executed and program cashes somewhere in between :)
		// Crash in a Program is no Good as it will impact performance of OS as well.
		// Whenever Crash comes, it occurs in a Line Number and from that line onwards nothing is executed !!
		// As a solution put your instruction in try catch block !! This will help to finishe the program gracefully :)
	}

}
