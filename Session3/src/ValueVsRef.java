
public class ValueVsRef {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = num1; // Value Copy : Copy the data of num1 into num2

		System.out.println(">> num1 is: "+num1);
		System.out.println(">> num2 is: "+num2);
		
		int[] a1 = {10, 20, 30, 40, 50};
		int[] a2 = a1; // Reference Copy : Copy HashCode from a1 into a2
		
		System.out.println(">> a1 is: "+a1);
		System.out.println(">> a2 is: "+a2);
		
		// With a2 Ref Var we are updating elements of Array
		a2[1] = 111;
		a2[3] = 333;
		
		// Lets Read Array with a1
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+"  ");
		}

	}

}
