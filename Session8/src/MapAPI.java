import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 	interface Map{
 	}
 	class HashMap implements Map{
 	}
 	class Hashtable implements Map{
 	}
 	
 	// Polymorphic Statement | Run Time Polymorphism :)
 	Map map;
 	map = new HashMap();
 	map = new Hashtable(); 
 */

public class MapAPI {

	public static void main(String[] args) {
		
		//HashMap<Integer, String> map = new HashMap<Integer, String>();	// Direct Object COnstruction
		Map<Integer, String> map = new HashMap<Integer, String>(); 			// Polymorphic Statement
		
		// key can be any type and value can be any type. You just specify the types in <>
		// In a Map, Keys are always Unique but value can be duplicated
		map.put(101, "John"); // 101 is the key and John is the value
		map.put(333, "John");
		map.put(333, "Kia");  // Update Operation on key 333
		map.put(765, "George");
		map.put(444, "Mike");
		map.put(123, "Fionna");
		
		// 1. Print map
		System.out.println(">> map is: "+map);
		// Data will be unordered as Hashing Algo comes into picture
		
		// 2. Get the Single Element from HashMap
		String name = map.get(333);
		System.out.println(">> name is: "+name);
		
		// 3. Size of Map
		System.out.println(">> map size is: "+map.size());
		
		// 4. Clear map
		//map.clear();
		
		// 5. Check for Key and Value
		if(map.containsKey(333)){
			System.out.println(">> 333 key is in the map");
		}
		
		if(map.containsValue("Mike")){
			System.out.println("Mike value is in the map");
		}
		
		// 6. Obtain all the Keys
		Set<Integer> keys = map.keySet(); // keySet() will return Set of all the keys in the map
		System.out.println(">> keys are: "+keys);
		
		// 7. Iterate in HashMap
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(">> "+key+"\t"+value);
		}
		
		// 8. How we can read a single element
		System.out.println(">> Value at key 123 is: "+map.get(123)); // in case we dont have a key map will return a null value

		// 9. Map can support null keys and null values.
		map.put(null, "Dave");
		map.put(111, null);
		
		System.out.println(">> map now is: "+map);
		
		//HashMap<Integer, ArrayList<String>> | Data Structure of Data Structure
		
		// 10. Iterate in HashMap using entrySet API
		// Entry is a key value pair in a HashMap :)
		System.out.println("===Using entrySet API===");
		Set<Entry<Integer, String>> eSet = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = eSet.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(">> "+entry.getKey()+"\t"+entry.getValue());
		}
		
		// map can point to HashMap object and also Hashtable Object
		// Hashtable is Thread-Safe version of HashMap
		// Hashtable will not allow null key and null value :)
		map = new Hashtable<Integer, String>();
		map.put(101, "John"); // 101 is the key and John is the value
		map.put(333, "John");
		map.put(333, "Kia");  // Update Operation on key 333
		map.put(765, "George");
		map.put(444, "Mike");
		map.put(123, "Fionna");
		//map.put(null, "Dave"); // null key not supported
		//map.put(111, null);	 // null value not supported
		
		System.out.println(">> map now is: "+map+" | "+map.getClass());
		
		//map.putAll();
		
		
	}

}
