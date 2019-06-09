package co.edureka.packone;

//class One is public
public class One {
	
	// Attributes
	private int a;
	int b;
	protected int c;
	public int d;
	
	// Methods
	private void pvtShow(){
		System.out.println(">> This is private show of One");
	}
	
	void defShow(){
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of One");
	}
}

// class Two is default 
class Two{
	private void pvtShow(){
		System.out.println(">> This is private show of Two");
	}
	
	void defShow(){
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of Two");
	}
}

// Error : In 1 .java file i.e. src file we can have only 1 public class
// If class is public .java file must be saved with that class name -> Rule
// If we have 2 public classes in 1 source file, we cannot give 2 names to 1 source file. hence, only 1 public class in 1 source file allowed
/*public class Three{ -> Error
	
}*/

// Multiple default classes allowed
/*class Four{ -> No Error
	
}*/

// private and protected not allowed here:
//errors below:
/*private class Five{
	
}

protected class Six{
	
}*/

// PS: As a conclusion, we can create 1 public class in 1 source file and many default classes.
//     No private or protected class allowed :)