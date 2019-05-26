
public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++){
			System.out.println(">> i is: "+i);
			// Nested Loop : loop within the loop
			for(int j=1; j<=i; j++){
				System.out.print(j+"  ");
			}
			System.out.println(); // to come in next line
		}

	}

}
