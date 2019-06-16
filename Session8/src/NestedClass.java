class Outer{
	
	void show(){
		System.out.println(">> show of Outer");
	}
	
	// for a helper kind of class, we can simply create it here:
	// Nested Class or Inner Class. OOPS Level -> Object in an Object | Containment Relation
	
	//private class Inner{
	//class Inner{
	//protected class Inner{
	public class Inner{
		void show(){
			System.out.println(">> show of Inner");
		}
	}
}


public class NestedClass {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		// Inner Class Object Construction with Reference to which is Outer Object !!
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

	}

}
