
public class StringAPIs {

	public static void main(String[] args) {
		
		// API is Application Programming Interfaces
		// Built In Code which we can use
		
		String names = "John, Jennie, Jim, Jack, Joe";
		int length = names.length(); // length() is a Built In Method of String Class and is String API for us
		System.out.println("Length of names is: "+length); // 28 i.e. from 0 to 27
		
		//char ch = names.charAt(2); 
		char ch = names.charAt(length-1);
		System.out.println(">> ch is: "+ch); // e 
		
		//int idx = names.indexOf('h');
		//int idx = names.indexOf('J');
		int idx = names.lastIndexOf('J'); // J form the end
		System.out.println(">> index of J is: "+idx); // ?
		
		int i = names.indexOf("Jennie");
		System.out.println(">> index of Jennie is: "+i); // 6 // Jennie's J starts from 6th index :)
		
		// Convert String into Array of Characters
		char [] chArr = names.toCharArray();
		for(char c : chArr){
			System.out.print(c+" ");
		}
		System.out.println();
		
		
		String restOfNames = names.substring(6); // We will get String from 6 and onwards before 6 it is removed
		System.out.println(">> restOfNames is: "+restOfNames);
		
		String name = names.substring(6, 12); // begin from 6 and less than 12 i.e. equal to 11
		System.out.println(">> name is: "+name);
		
		String upper = names.toUpperCase(); // toLowerCase
		System.out.println("upper is: "+upper);
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")){
			System.out.println(">> "+email+" is a valid email");
		}else{
			System.out.println(">> "+email+" is not a valid email");
		}
		
		String songName = "SomeSong.mp3";
		if(songName.endsWith(".mp3")){ // startWith
			System.out.println(">> We can play the song "+songName);
		}else{
			System.out.println(">> We cannot play the song "+songName);
		}
		
		String s1 = "Mr.";
		String s2 = "John";
		//String s3 = s1.concat(s2);
		String s3 = s1 + s2;
		System.out.println(">> s3 is: "+s3);
		
		//String names = "John, Jennie, Jim, Jack, Joe";
		String[] strArr = names.split(",");
		for(String s : strArr){
			System.out.println(s.trim()); // trim eliminates white spaces from leading and trailing of String
		}
		
		String modifiedNames = names.replace('J', 'K');
		System.out.println(">> modifiedNames: "+modifiedNames);
		
	}

}
