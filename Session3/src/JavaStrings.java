
public class JavaStrings {

	public static void main(String[] args) {
		
		char ch = 'A'; // char is meant to store only 1 single character
		//char ch = 'AB'; // err
		//char ch = "AB"; // err
		
		// S in String is in upper case :)
		String saluation = "Mr.";
		String name = "John";
		String lname = "Watson";
		
		String fullName = saluation+" "+name+" "+lname;
		
		System.out.println("ch is: "+ch);
		//System.out.println("Name is: "+saluation+name+lname); // saluation+name+lname -> String Concatenation (Merging the Strings)
		System.out.println("Full Name is: "+fullName);
		
		// String can accommodate any number of characters :)
		
		// Different Ways to Create a String

		// 1. Interned Way
		String str1 = "Hello";
		String str2 = "Hello";
		
		// 2. Object Way
		String str3 = new String("HeLLo");
		String str4 = new String("Hello");
		
		// new creates a new String in the Memory
		
		// If we Print Reference Variables we do not get to see the HashCodes as we have discussed !!
		// Reference Variable will print the Textual Data instead of HashCode
		// toString() method will be executed automatically when we will print ref vars and hence we see data and not HashCodes as toString returns data
		System.out.println(">> str1 is: "+str1);
		System.out.println(">> str2 is: "+str2);
		System.out.println(">> str3 is: "+str3);
		System.out.println(">> str4 is: "+str4);
		
		System.out.println();
		// toString() is a Method which is available in String class.
		// Gets Executed when we print Reference Variable of String
		// Below we are executing them explicitly
		System.out.println(">> str1.toString() is: "+str1.toString());
		System.out.println(">> str2.toString() is: "+str2.toString());
		System.out.println(">> str3.toString() is: "+str3.toString());
		System.out.println(">> str4.toString() is: "+str4.toString());
		
		// Here equals to operator == will compare References 
		if(str1 == str2){
			System.out.println(">> str1 == str2");
		}else{
			System.out.println(">> str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println(">> str3 == str4");
		}else{
			System.out.println(">> str3 != str4");
		}
		
		if(str1 == str3){
			System.out.println(">> str1 == str3");
		}else{
			System.out.println(">> str1 != str3");
		}
		
		// To Compare Data we can use equals or compareTo method
		if(str1.equals(str2)){
			System.out.println(">> str1 equals str2");
		}else{
			System.out.println(">> str1 !equals str2");
		}
		
		if(str3.equals(str4)){
			System.out.println(">> str3 equals str4");
		}else{
			System.out.println(">> str3 !equals str4");
		}
		
		//if(str1.equals(str3)){
		if(str1.equalsIgnoreCase(str3)){
			System.out.println(">> str1 equals str3");
		}else{
			System.out.println(">> str1 !equals str3");
		}
		
		if(str1.compareTo(str2) == 0){
			System.out.println(">> str1 comparedTo str2");
		}else{
			System.out.println(">> str1 !comparedTo str2");
		}
		
		if(str3.compareTo(str4) == 0){
			System.out.println(">> str3 comparedTo str4");
		}else{
			System.out.println(">> str3 !comparedTo str4");
		}
		
		//if(str1.compareTo(str3) == 0){
		if(str1.compareToIgnoreCase(str3) == 0){
			System.out.println(">> str1 comparedTo str3");
		}else{
			System.out.println(">> str1 !comparedTo str3");
		}

	}

}
