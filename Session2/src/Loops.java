
public class Loops {

	public static void main(String[] args) {
		
		//int number = 5;
		//int i = 1;
		
		// Use Case : When in programming we need to do the same job again and again
		// We should use Loops instead of writing so much of code !!
		
		/*
		System.out.println(number+" "+i+"'s are "+(number*i)); 
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; 
		*/
		
		int number = 5;
		int i = 1;
		
		// Condition is tested at the beginning
		while(i<=10){ // Keep on executing statements written in while loop till this i is less than or equal to 10
			System.out.println(number+" "+i+"'s are "+(number*i));
			//i++;  // i = i + 1;
			//i = i + 1;
			i += 2; //i = i + 2;
		}
		System.out.println("---------");
		System.out.println("i is: "+i); // 11
		
		// do while is use case for anything which must be executed on a minimum of 1 even condition will not be passing
		
		number = 7;
		i = 171; // Update i value to 1 again :)
		System.out.println("i now is: "+i); // 1
		System.out.println("---------");
		
		do{
			System.out.println(number+" "+i+"'s are "+(number*i));
			i++;
		}while(i<=10); // Condition is tested at the end
		
		System.out.println("---------");
		
		// for loop : a better version of while loop
		// we can do everything in the single line
		for(number=9, i=1; i<=10; i++){
			System.out.println(number+" "+i+"'s are "+(number*i)); // Core Logic
		}
		
		// Real time use case : Listing of data in apps !! eg: Search Result Lists are displayed using a loop
		// Contact/WhatsApp -> Data is shown as List and it uses a loop to show the data in the list !!
	}

}
