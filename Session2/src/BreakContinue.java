
public class BreakContinue {

	public static void main(String[] args) {
		
		// Creating i in loop is optimization
		// When loop will start i will be created in memory and when loop will finish i will be destroyed from memory
		for(int i=1; i<=10; i++){
			// We wish to print First number divisible by 3
			
			System.out.println(">> Testing i value: "+i);
			
			if(i%3==0){
				System.out.println(">> First number divisble by 3 is "+i);
				break; // break shall terminate the loop 
			}
			
		}
		
		// continue : Explore Yourself | Google it Up !! (Exploratory Task)

	}

}
