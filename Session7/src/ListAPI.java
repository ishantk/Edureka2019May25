import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Product{
	int pid;
	String name;
	int price;
	
	void showProduct(){
		System.out.println(pid+" | "+name+" | "+price);
	}
}

public class ListAPI {

	public static void main(String[] args) {
		
		// 1. List Creation
		ArrayList list1 = new ArrayList(); 						// Hetrogeneous: Add any type of data
		ArrayList<String> list2 = new ArrayList<String>(); 		// Homogeneous : Add only Strings
		ArrayList<Product> list3 = new ArrayList<Product>(); 	// Homogeneous : Add only Product Objects | Cart
		
		//List list1 = new ArrayList();						    // Polymorphic Statement
		
		Product p1 = new Product();
		p1.pid = 101;
		p1.name = "iPhoneX";
		p1.price = 60000;
		
		Product p2 = new Product();
		p2.pid = 201;
		p2.name = "Samsung LED";
		p2.price = 50000;
		
		// 2. Add Data in List
		
		// Hetrogeneous List
		list1.add(10);			//0
		list1.add(10.34); 		//1
		list1.add('A'); 		//2
		list1.add("John"); 		//3
		list1.add("Jennie"); 	//4
		list1.add(p1);			//5
		
		// Homogeneous List
		//list2.add(10); 		err
		//list2.add(p1);		err
		list2.add("John");		//0
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("John");		// supports duplicacy i.e. duplicate data can be added
		list2.add("Kia");
		list2.add("Fionna");    //n-1, where n is size of list
		
		//list3.add("John");	err
		//list3.add(10);		err
		list3.add(p1);			//0
		list3.add(p2);			//1
		
		// 3. Print List
		System.out.println("====list1====");
		System.out.println(list1);
		
		System.out.println("====list2====");
		System.out.println(list2);
		
		System.out.println("====list3====");
		System.out.println(list3);
		
		// 4. Get Size of List
		System.out.println(">> list1 size is: "+list1.size());
		System.out.println(">> list2 size is: "+list2.size());
		System.out.println(">> list3 size is: "+list3.size());
		
		// 5. Read Single Element in List
		// Object is a class in Java which is parent to all the classes.
		// As per polymorphism, ref var o can point to any type :)
		Object o = list1.get(3);
		
		String name = list2.get(1);
		Product product = list3.get(0);
		
		System.out.println(">> o is: "+o);
		System.out.println(">> name is: "+name);
		product.showProduct();
		
		System.out.println();
		
		// 6. Update Operation
		System.out.println(">> list2 before update is: "+list2);
		list2.set(2, "Sia Watson");
		System.out.println(">> list2 after update is: "+list2);
		
		System.out.println();
		
		// 7. Delete Operation
		System.out.println(">> list2 before delete is: "+list2);
		list2.remove(2);
		System.out.println(">> list2 after delete is: "+list2);
		
		System.out.println(">> name is: "+list2.get(2)); // ?
		
		// 8. Add the data on a specific index :)
		list2.add(2, "Mike");
		System.out.println(">> list2 now is: "+list2);
		
		// 9. Get Index of Element
		//int idx = list2.indexOf("John");
		int idx = list2.lastIndexOf("John");
		System.out.println(">> idx is: "+idx);
		
		// 10. Check for Element
		if(list2.contains("John")){
			System.out.println(">> John is in the list");
		}
		System.out.println();
		
		
		// 11. Iterate in List :)
		// 11.1 >> For Loop
		System.out.println("*******For Loop*******");
		for(int i=0;i<list1.size();i++){
			Object oRef = list1.get(i); // Object is Parent to every type in Java :)
			System.out.println(">> "+oRef);
		}
		System.out.println();
		
		for(int i=0;i<list2.size();i++){
			String str = list2.get(i);
			System.out.println(">> "+str);
		}
		System.out.println();
		
		for(int i=0;i<list3.size();i++){
			Product pRef = list3.get(i);
			pRef.showProduct();
		}
		
		System.out.println();
		
		// 11.2 >> Enhanced For loop i.e. for each loop
		System.out.println("*******Enhanced For Loop*******");
		for(Object oRef : list1){
			System.out.println(">> "+oRef);
		}
		System.out.println();
		
		for(String str : list2){
			System.out.println(">> "+str);
		}
		System.out.println();
		
		for(Product pRef : list3){
			pRef.showProduct();
		}
		System.out.println();
	
		// 11.3 >> Iterator API
		System.out.println("*******Iterator*******");
		
		Iterator itr1 = list1.iterator();
		Iterator<String> itr2 = list2.iterator();
		Iterator<Product> itr3 = list3.iterator();
	
		// We can iterate and fetch the data one by one using next()
		//System.out.println(itr2.next());
		//System.out.println(itr2.next());
		//System.out.println(itr2.next());
		
		System.out.println(">> list2 before iterator is: "+list2);
		while(itr2.hasNext()){
			String str = itr2.next();
			System.out.println(">> "+str);
			
			if(str.equals("Jennie")){
				itr2.remove(); // removes element from list
			}
		}
		System.out.println(">> list2 after iterator is: "+list2);
		
		System.out.println();
		
		// 11.4 >> Iterator API : can iterate in both directions one by one :)
		System.out.println("*******ListIterator*******");
		
		ListIterator<String> listItr2 = list2.listIterator();
		while(listItr2.hasNext()){
			String str = listItr2.next();
			System.out.println(">> "+str);
		}
		System.out.println("=====");
		while(listItr2.hasPrevious()){ // will only work of you are in the last position in list :)
			String str = listItr2.previous();
			System.out.println(">> "+str);
		}
		
		// Query : Read Last Element
		String s = list2.get(list2.size()-1);
		System.out.println(">> s is: "+s);
		
		System.out.println();
		
		// 11.5 >> Enumeration : Exactly like Iterator but cannot remove the element
		System.out.println("*******Enumeration*******");
		
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String str = enm.nextElement();
			System.out.println(">> "+str);
		}
		
		System.out.println();
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("George");
		names.add("Leo");
		names.add("Harry");
		
		System.out.println(">> names is: "+names);
		
		names.addAll(list2); // we can add all the elements of one list into another
		
		System.out.println(">> names now is: "+names);
		
		names.clear(); // Makes the List Empty | Delete All Operation
		
		System.out.println(">> names after clear is: "+names);
		
		// Explore : Collections.sort(list);
		//			 Comparator API | Sorting
	}

}
