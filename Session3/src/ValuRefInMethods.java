
public class ValuRefInMethods {

	static void squareOfNum(int num){ // Passing Value as Input to the Method
		num = num*num;
		System.out.println(">> num is: "+num); // num 100
	}
	
	static void squareOfNums(int[] nums){ // Passing Reference as Input to the Method
		System.out.println(">> nums is: "+nums);
		for(int i=0;i<nums.length;i++){
			nums[i] = nums[i] * nums[i]; // if we change in nums, change will be also reflected for arr as both of them points to the Same Array
		}
	}
	
	public static void main(String[] args) {
	
		int n = 10;
		squareOfNum(n); // Executing/Calling Method by Value | We can call/execute it directly as main and squareOfNum is in the same class
		System.out.println(">> n is: "+n); // n 10
		

		int[] arr = {1, 3, 5, 7, 9};
		// arr contains HashCode
		System.out.println(">> arr is: "+arr);
		
		squareOfNums(arr); // Executing/Calling Method by Reference. We are Sending HashCode
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  "); // ??
		}
		System.out.println();
	}

}
