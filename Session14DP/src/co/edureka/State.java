package co.edureka;

interface CabState{
	void showState();
}

class Booked implements CabState{
	
	public void showState() {
		System.out.println(">> Cab is Booked");
	}
}

class Idle implements CabState{
	
	public void showState() {
		System.out.println(">> Cab is Idle");
	}
}

class Cancelled implements CabState{
	
	public void showState() {
		System.out.println(">> Cab is Cancelled");
	}
}

class Cab{
	
	CabState state; // HAS-A Relationship : Cab HAS A State :)
	
	void changeState(CabState cs){
		state = cs; // Changed the state of Cab
	}
	
}

public class State {

	public static void main(String[] args) {
		
		Idle idle = new Idle();
		Booked booked = new Booked();
		Cancelled cancelled = new Cancelled();
		
		Cab cab = new Cab();
		System.out.println(">> A New Driver Logged Into Application for Cab KA12AB1234");
		cab.changeState(idle);
		cab.state.showState();
		
		
		System.out.println();
		// A new customer requested for a Cab
		System.out.println(">> Driver Accepted a new booking for Cab KA12AB1234");
		cab.changeState(booked);
		cab.state.showState();
		
		System.out.println();
		// If customer cancels the Cab
		System.out.println(">> Customer Cancelled the Cab KA12AB1234");
		cab.changeState(cancelled);
		cab.state.showState();
	}

}
