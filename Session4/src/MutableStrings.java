
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE. This means Strings cannot be changed !!
		
		//String str = "Hello";
		String str = new String("Hello");
		String strConcat = str.concat(" World"); // This is a String manipulation operation. It will give/generate a new String
		
		System.out.println("str is: "+str); // Hello
		System.out.println("strConcat is: "+strConcat); // Hello World
		

		// StringBuffer is MUTABLE. This means data can be manipulated in the same Object. Not a new String will be generated in memory !!
		// StringBuffer is Thread-Safe/Synchronized
		
		// These cannot be used as interned way 
		// StringBuffer buffer = "Hello"; // Error
		// StringBuilder builder = "Hello"; // Error
		
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		
		System.out.println("buffer is: "+buffer);
		
		// StringBuffer is Not Thread-Safe/Synchronized
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		
		System.out.println("builder is: "+builder);
		
		// StringBuffer/StringBuilder -> Lets say we have a cloud API which sends back JSON Response.
		// JSON Response is a Textual formatted data which we need to save in some String.
		// If we keep on concatenating the response, we will get lot od Strings. We must use Stringbuffer/StringBuilder to read JSON from Server API;s
	}

}
