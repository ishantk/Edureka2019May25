
public class Overloading {

	// Overloading : Compile Time Polymorphism
	// Use the same method name if you have different inputs
	void addNumbers(int num1, int num2){
		int sum = num1 + num2;
		System.out.println(">> sum of "+num1+" and "+num2+" is: "+sum);
	}
	
	// Error: We cannot overload if the same inputs are passed again i.e. same number and same type of inputs not the names !!
	/*void addNumbers(int n1, int n2){
		int sum = n1 + n2;
		System.out.println(">> sum of "+n1+" and "+n2+" is: "+sum);
	}*/
	
	// Error: Return Type cannot overload a Method
	/*int addNumbers(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}*/
	
	// Number of Inputs
	void addNumbers(int num1, int num2, int num3){
		int sum = num1 + num2 + num3;
		System.out.println(">> sum of "+num1+" and "+num2+" and "+num3+" is: "+sum);
	}
	
	// Type of Inputs
	void addNumbers(double num1, double num2){
		double sum = num1 + num2;
		System.out.println(">> sum of "+num1+" and "+num2+" is: "+sum);
	}
	
	// Sequence of Inputs
	void addNumbers(int num1, double num2){
		double sum = num1 + num2;
		System.out.println(">> sum of "+num1+" and "+num2+" is: "+sum);
	}
	
	void addNumbers(double num1, int num2){
		double sum = num1 + num2;
		System.out.println(">> sum of "+num1+" and "+num2+" is: "+sum);
	}
	
	// Rules of Overloading:
	// 1. Method Name Should be Same
	// 2. Inputs Should be always Different -> Only and only Inputs play the role
	//    2.1. Number of Inputs (Increase or Decrease)
	//    2.2 Type of Inputs
	//	  2.3 Sequence of inputs
	// 3. Return type may be same or different but has no role to play in overloading
	
	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		
		oRef.addNumbers(10, 20);			// Line#46 Method frame will be created and destroyed when method finishes its execution
		oRef.addNumbers(10, 20, 30);		// Line#47 Method frame will be created after Line#46 is executed and destroyed when method finishes its execution		
		oRef.addNumbers(2.2, 3.3);
		oRef.addNumbers(2.2, 19);
		oRef.addNumbers(21, 3.3);
		//oRef.addNumbers(21, 3.3, 4.4); // as no matching definition available

		// Same Method is now capable of performing different tasks
	}

}
