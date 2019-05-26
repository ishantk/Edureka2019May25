
public class MultiDimArrays {

	public static void main(String[] args) {
		
		// Array - 1D Array
		int[] a1 = {10, 20, 30, 40, 50};
		
		// Array of Arrays -> 2D Array
		int[][] a2 = {
						{10, 20},			// 0
						{10, 20, 30, 40},	// 1
						{10},				// 2
						{10, 20, 30},		// 3
						{10, 20, 30, 40, 50}// 4
				     }; 
		
		System.out.println("a1 is "+a1+" and length is: "+a1.length); // 5
		System.out.println("a2 is "+a2+" and length is: "+a2.length); // 5
		
		System.out.println("a1[0] is: "+a1[0]); // 10
		System.out.println("a2[0] is: "+a2[0]); // HashCode for 0th Array in a2
		System.out.println("a2[0][0] is: "+a2[0][0]); // 0th Arrays 0th Element
		
		System.out.println(">> Reading Entire 2-D Array");
		for(int i=0;i<a2.length;i++){ // 5 times i: 0, 1, 2, 3, 4
			for(int j=0;j<a2[i].length;j++){ // i:0|j:0,1  # i:1|j:0,1,2,3 # i:2|j:0 # i3:j:0,1,2 # i4:j:0,1,2,3,4
				System.out.print(a2[i][j]+"  "); // printing ith Arrays jth Index
			}
			System.out.println();
		}

		// Explore how we can implement a nested enhanced for loop on 2-D Arrays :)
	}

}
