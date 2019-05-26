
public class MultiDimSyntax {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3]; // Array of Arrays -> AOA can represent Matrix
		// arr is array of 3 arrays
		// each array will contain 3 elements
		// all the elements will be 0
		
		for(int i=0;i<arr.length;i++){ 
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] brr = new int[3][];
		// brr is array of 3 arrays
		// each array will contain how many elements that is not know till now
		
		brr[0] = new int[1]; // 0th Array will have 1 element
		brr[1] = new int[2]; // 1st Array will have 2 elements
		brr[2] = new int[3]; // 2nd Array will have 3 elements
		// All elements are 0
		
		for(int i=0;i<brr.length;i++){ 
			for(int j=0;j<brr[i].length;j++){
				System.out.print(brr[i][j]+"  ");
			}
			System.out.println();
		}

		
		//int[][][] a3 = new int[3][3][3]; | We can have any dimensions
	}

}
