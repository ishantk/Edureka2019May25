class MovieTicket{
	
	// At 1 instance of time only 1 thread can use this method now !!
	// A lock will be acquired by the thread who is using it, and shall be released when thread has finished this method usage
	//synchronized void bookMovieTicket(int fromSeatNo, int toSeatNo, String movie, String cinemaHall, String customerName){
	void bookMovieTicket(int fromSeatNo, int toSeatNo, String movie, String cinemaHall, String customerName){
		System.out.println("========================================");
		System.out.println("Hello, "+customerName);
		
		if(Data.lastTicket>=fromSeatNo && Data.lastTicket<=toSeatNo){
			System.out.println(">> Sorry "+Data.lastTicket+" is not available. Please Book another Seats");
		}else{
			for(int i=fromSeatNo; i<=toSeatNo; i++){
				System.out.println(customerName+" Seat #"+i+" booked for "+movie+" at "+cinemaHall);
			}
			System.out.println("======Tickets Booked "+customerName+"=======");
		}
		
		Data.lastTicket = toSeatNo;
	}
	
	void buyFoodItems(){
		System.out.println(">> Food Items also Purchased");
	}
	
}

class BookTicketThread extends Thread{ // IS-A Relation i.e. BookTickteThread IS-A Thread 
	
	// Has-A Relationship
	MovieTicket mRef;
	
	// Constructor
	BookTicketThread(MovieTicket m){
		mRef = m;
	}
	
	public void run() {
		// Till the below synchronized block will not finish its execution no other thread can access mRef.
		// Its a Lock on Object i.e. pointed by mRef. :)
		synchronized (mRef) {
			
			try {
				mRef.wait(); // where a thread will stop its execution and starts waiting for a notification on mRef
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			mRef.bookMovieTicket(5, 10, "Avengers", "PVR Bangalore", "**John** ");
			mRef.buyFoodItems();
		}
		
	}
}

class AnotherBookTicketThread extends Thread{ // IS-A Relation i.e. BookTickteThread IS-A Thread 
	
	// Has-A Relationship
	MovieTicket mRef;
	
	// Constructor
	AnotherBookTicketThread(MovieTicket m){
		mRef = m;
	}
	
	public void run() {
		synchronized (mRef) {
			mRef.bookMovieTicket(5, 10, "Avengers", "PVR Bangalore", ">>Fionna>> ");
			mRef.notify(); // notify waiting thread on mRef
			//mRef.notifyAll(); // in case multiple threads are witing on the same object ofcourse :)
		}
	}
}

class Data{
	public static int lastTicket = 0;
}


public class Synchronization {

	public static void main(String[] args) {
		
		MovieTicket mRef = new MovieTicket();

		//mRef.bookMovieTicket(5, 10, "Avengers", "PVR Bangalore", "John");

		// Previously we were booking the ticket in main thread and now the task of  booking tickets is given to a separate Thread
		// main and BookTicketThread runs parallel i.e. asynchronously :)
		
		// In the below use case 
		// we have 2 different threads but are going to work on same single object referred by mRef
		// Both threads run together and hence both customers will be able to book tickets together
		// thats the reason why we anted asynchronization :)
		
		// Synchronization : is acquiring a lock by a thread on a resource so that other threads should wait till this thread has not finished its execution
		// Why Synchronization: If multiple threads are working on the same single object !!
		
		BookTicketThread th1 = new BookTicketThread(mRef);
		//BookTicketThread th2 = new BookTicketThread(mRef);
		AnotherBookTicketThread th2 = new AnotherBookTicketThread(mRef);
		
		th1.start(); // John
		th2.start(); // Fionna
		
	}

}
