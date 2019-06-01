
public class Methods {
	
	// Create Method within the scope of class
	// void -> Acknowledgement / Return Type | Do not acknowledge
	// addNumbers -> is name of method, which can be any name of your choice
	// num1 and num2 are 2 inputs which are single value containers and belong to/property of addNumbers method
	// { } -> In the scope of method we have its definition what method should do !!
	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println(">> sum of "+num1+" and "+num2+" is: "+num3);
	}
	
	// We can have an ack as some data type (Either Primitive eg: int float char or Reference Type eg: Arrays or Objects)
	// int -> Ack/Return Type : We have to return some integer value at the end of Method Definition
	int addNumbersAgain(int num1, int num2){
		int num3 = num1 + num2;
		return num3; // Must be the Last Statement
	}
	
	// Method, which takes no inputs and returns nothing
	void sayHello(){
		System.out.println(">> Hello All !!");
	}

	// main is a method : This gets executed when we run our program
	// whatever we write in a method is executed sequentially i.e. one after the other
	public static void main(String[] args) {
		
		/*
		int num1 = 10;
		int num2 = 20;
		
		int num3 = num1 + num2;
		
		System.out.println(">> sum of "+num1+" and "+num2+" is: "+num3);
		
		// Challenge : If we wish to recompute sum for some other numbers
		//			   We need to write similar statements again and again
		
		// example : Like Below:
		num1 = 11;
		num2 = 17;
		
		num3 = num1 + num2;
		System.out.println(">> sum of "+num1+" and "+num2+" is: "+num3);
		
		// We need to see in our program what is getting repeated again and again
		// And We cannot put them in a loop !!
		// So, we shall create a Method (Procedure)
		*/
		
		// Execution of Method : addNumbers
		// 1. Write Object Construction Statement for class Methods
		// 2. With Reference of Object execute addNumbers method.
		
		//int[] arr = new int[5];		// arr is ref variable which points to array in heap of 5 elements
		Methods mRef = new Methods();	// mRef is ref var which points to object of Methods in Heap
		// mRef contains HashCode of an Object. Object is also a Multi Value Container (To be explored in upcoming sessions)
		
		// new will create array/object in heap area and returns back HashCode !!
		
		mRef.addNumbers(10, 20); // Execution of Method addNumbers
		mRef.addNumbers(11, 17);
		mRef.addNumbers(7, -3);
		mRef.addNumbers(12, 2);
		
		// in result we will capture the returned data from function
		int result = mRef.addNumbersAgain(50, 70);
		System.out.println(">> Result for 50 and 70 is: "+result);
		// Returned data shall be directly printed rather than storing in some variable and displaying it
		System.out.println(">> Result for 90 and 90 is: "+mRef.addNumbersAgain(90, 90));
		
		mRef.sayHello();
	}

}
