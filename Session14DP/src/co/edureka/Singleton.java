package co.edureka;

/*
class Connection{
	
	Connection(){
		System.out.println(">> Connection Object Constructed: "+this); // this is a reference variable which holds HashCode of Current Object
	}
	
}*/

class Connection{
	
	// Create Object Internally in the class
	private static Connection con = new Connection();
	
	// Outside Connection class we cannot create any objects !!
	private Connection(){
		System.out.println(">> Connection Object Constructed: "+this); // this is a reference variable which holds HashCode of Current Object
	}
	
	// static -> can be accessed by class name
	// returns Connection Object's Reference
	public static Connection getConnection(){
		return con;
	}
	
}

public class Singleton {

	public static void main(String[] args) {

		// We have created 2 objects below:
		// We can create as many as objects we want !!
		// Connection c1 = new Connection();
		// Connection c2 = new Connection();
		
		// Below we are getting errors as Connection Constructor is private !!
		// Connection c1 = new Connection(); err
		// Connection c2 = new Connection(); err

		Connection c1 = Connection.getConnection();
		Connection c2 = Connection.getConnection();
	}

}
