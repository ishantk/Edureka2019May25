package co.edureka;

interface FoodItem{
	String description();
	int price();
}

class VeggieBurger implements FoodItem{
	
	public String description() {
		return "Veggie Burger Loaded With Greens !!";
	}
	
	public int price() {
		return 100;
	}
}

// FoodDecorator takes FoodItem as Input and returns its description and price :)
abstract class FoodDecorator implements FoodItem{
	
	FoodItem item; // HAS-A Relation
	
	public FoodDecorator(FoodItem item) {
		this.item = item;
	}
	
	public String description() {
		return item.description();
	}
	
	public int price() {
		return item.price();
	}
	
}

class BurgerMeal extends FoodDecorator{
	
	public BurgerMeal(FoodItem item) {
		super(item);
	}
	
	public String description() {
		return item.description()+" A Meal with Coke and Fries";
	}
	
	public int price() {
		return item.price() + 75;
	}
}

// Dynamically modify behaviour of Object :)
public class Decorator {

	public static void main(String[] args) {
		
		FoodItem burger = new VeggieBurger();
		System.out.println(">> "+burger.description()+" | Rs."+burger.price());
		
		System.out.println(">> After we convert burger FoodItem as a Meal");
		
		// Polymorphic Statement
		FoodItem meal = new BurgerMeal(burger); // burger is getting modified as a meal !!
		System.out.println(">> "+meal.description()+" | Rs."+meal.price());
	}

}
