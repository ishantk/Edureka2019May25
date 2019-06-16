import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetAPI {

	public static void main(String[] args) {
		
		//Set set = new HashSet();	 // Polymorphic Statement
		//HashSet set = new HashSet(); // Direct Object Construction
		
		// In case of HashSet we dont have indexes rather we have HashCodes which are not known to us !!
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>(); // Sorted Version of HashSet
		set.add("John");		
		set.add("Jennie");
		set.add("Jim");
		set.add("Bob");
		set.add("Jack");
		set.add("John");
		set.add("Annie");
		set.add("Kia");
		set.add("Jim");
		set.add("Dave");
		
		System.out.println(">> set is: "+set);
		// 1. Data is Unordered due to Hashing (Algo)
		// 2. No Duplicate Elements added. So not support redundancy !!
		// 3. We cannot use for loop as we have no indexes. We cannot get single element from HashSet
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(">> "+name);
		}
		

		System.out.println(">> Size is: "+set.size());
		set.remove("Kia");
		System.out.println(">> set now is: "+set+" | "+set.size());
		
		if(set.contains("John")){
			System.out.println(">> John is in the Set");
		}
		
		//set.addAll() -> Explore
	}

}
