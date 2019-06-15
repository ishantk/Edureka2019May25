
public class Wrappers {

	public static void main(String[] args) {
	
		// Primitives: Value Type
		int i = 10;
		char ch = 'A';
		double d = 2.25;
		
		// Lets convert Primitives to References i.e. into Objects
		
		// BOXING : Converting Primitive into an Object
		Integer iRef = new Integer(i);
		Character chRef = new Character(ch);
		Double dRef = new Double(d);
		
		// Integer, Character and Double are Wrapper Classes :)
		
		// UNBOXING : Getting the primitive out of Object
		int i1 = iRef.intValue();
		char ch1 = chRef.charValue();
		double d1 = dRef.doubleValue();

		// AUTO-BOXING
		Integer iRef1 = i; // -> Integer iRef1 = new Integer(i);
		// AUTO-UNBOXING
		int i2 = iRef1;    // -> int i2 = iRef1.intValue();
		
	}

}
