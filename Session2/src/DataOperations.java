
public class DataOperations {

	// Whatever we write in main is executed in a sequence
	// main is entry point for our program :)
	public static void main(String[] args) {
		
		double orderPrice = 1000;
		int taxes = 18;
		
		double taxOnOrderPrice = (1000 * 18)/100;
		
		// ____ + % taxes on + ____ + will be + ____ | Concatenation
		System.out.println(taxes+"% taxes on "+orderPrice+" will be "+taxOnOrderPrice);
		
		orderPrice = orderPrice + taxOnOrderPrice; // updating container 
		System.out.println("Please Pay \u20b9"+orderPrice); // 1180
		
		int number = 20;
		int remainder = number % 3;
		System.out.println("Remainder is: "+remainder);
		
		orderPrice++; // orderPrice = orderPrice + 1 | Postfix
		++orderPrice; // orderPrice = orderPrice + 1 | Prefix
		
		System.out.println("Order Price Now is: \u20b9"+orderPrice); // 1182
		
		System.out.println("Can we Offer Discount? "+ (orderPrice >= 1000) );
		System.out.println("Is order Price equal to 1182? "+(orderPrice == 1182));
		
		// && says both should be true i will return true
		// || says any one should be true i will return true
		// ! will convert true to false and vice versa
		System.out.println("Can we Offer Discount based on taxes as well? "+ (orderPrice >=1000 && taxOnOrderPrice>=200));
		System.out.println("Can we Offer Discount based on taxes or on Price ? "+ (orderPrice >=1000 || taxOnOrderPrice>=200));

		// In Apps like UberEats, Zomato or Swiggy when we place an order for food to be delivered at Home
		// We need to have such calculations or even something different which shall include these Operators
		
		int quantity = 1;
		quantity++; // 2
		quantity++; // 3
		quantity--; // 2
		
		System.out.println("Quantity: "+quantity); // 2
		
		
	}

}
