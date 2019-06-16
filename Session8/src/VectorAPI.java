import java.util.ArrayList;
import java.util.Vector;

public class VectorAPI {

	public static void main(String[] args) {
		
		// Not Thread-Safe
		ArrayList<String> list = new ArrayList<String>();
		list.add("George");
		list.add("Leo");
		list.add("Harry");

		// Thread-Safe i.e. It is Synchronized
		Vector<String> vector = new Vector<String>();
		vector.add("George");
		vector.add("Leo");
		vector.add("Harry");
		
		System.out.println(">> list is: "+list);
		System.out.println(">> vector is: "+vector);

		
	}

}
