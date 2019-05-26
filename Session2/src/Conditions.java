
public class Conditions {

	public static void main(String[] args) {
		
		double orderPrice = 700.0;
		
		// Discount Coupon can be applied if order value is greater than 1000 | FLAT50 Discount Coupon
		
		// Simple if/else // only 1 condition is tested
		/*
		if(orderPrice >= 1000){
			// We shall offer a discount
			System.out.println("Flat50 Discount is Applicable on \u20b9"+orderPrice);
			orderPrice = orderPrice / 2;
			System.out.println("Please Pay \u20b9"+orderPrice);
		}else{
			System.out.println("Please Pay \u20b9"+orderPrice+". No Dicsount Available");
		}
		*/
		
		
		// Ladder if/else //  multiple conditions can be tested
		if(orderPrice >= 1000){
			// We shall offer a discount
			System.out.println("Flat50 Discount is Applicable on \u20b9"+orderPrice);
			orderPrice = orderPrice / 2;
			System.out.println("Please Pay \u20b9"+orderPrice);
		}else if(orderPrice >=500 && orderPrice<1000){
			System.out.println("Flat30 Discount is Applicable on \u20b9"+orderPrice);
		}else if(orderPrice >=200 && orderPrice<500){
			System.out.println("Flat10 Discount is Applicable on \u20b9"+orderPrice);
		}else{
			System.out.println("Please Pay \u20b9"+orderPrice+". No Dicsount Available");
		}
		
		// Nested if else // condition checking within conditions
		boolean internetState = true;
		boolean gpsState = false; // Turn OFF GPS in our Phone
		
		if(internetState){
			System.out.println("You can use Google Maps");
			if(gpsState){
				System.out.println("You can Navigate with Google Maps");
			}else{
				System.out.println("Please Enable GPS and Try Again for Navigation");
			}
		}else{
			System.out.println("Please Enable Internet and Try Again to use Google Maps");
		}

	}

}
