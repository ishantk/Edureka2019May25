package co.edureka;

interface Plan{
	// Rules:
	void setPlan();
	void showPlan();
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	public void setPlan() {
		data = 5;
		price = 200;
	}
	
	public void showPlan() {
		System.out.println(">> Plan2G will give "+data+" GB of data for Rs."+price);
	}
}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	public void setPlan() {
		data = 8;
		price = 300;
	}
	
	public void showPlan() {
		System.out.println(">> Plan3G will give "+data+" GB of data for Rs."+price);
	}
}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	public void setPlan() {
		data = 10;
		price = 500;
	}
	
	public void showPlan() {
		System.out.println(">> Plan4G will give "+data+" GB of data for Rs."+price);
	}
}

class PlanFactory{
	
	public static Plan getPlan(int typeOfPlan){
		
		Plan plan=null; // Reference Variable of Plan
		
		// Polymorphic Statements : reference variable of interfcae can point to objects which implements it !!
		switch (typeOfPlan) {
			case 2:
				plan = new Plan2G();
				break;

			case 3:
				plan = new Plan3G();
				break;
				
			case 4:
				plan = new Plan4G();
				break;
		}
		
		plan.setPlan();
		return plan;
	}
	
}

public class Factory {

	public static void main(String[] args) {
		
		// Factory as Design Pattern
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();
		
	}

}
