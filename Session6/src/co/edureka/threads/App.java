package co.edureka.threads;

/*class MyTask{
	
	void execute(){
		for(int i=1;i<=10;i++){ 			   
			System.out.println(">> Printing **LearningPython.pdf** Copy #"+i);
		}
	}
}*/

// 1. We need to identify any Task/Operation which may take longer time than usual !!
//    Due to a long running operation in main, main can be blocked i.e. more instructions of main can be blocked
//    Here OS will give us an error: Application Not Responding !! Would you like to wait for Application or Kill It.
//    App shall give a feel of Hang to User

//    Solution is to introduce Threads, which will run Parallel with main thread !!
// 	  Threads are running together i.e. Parallel or Asynchronously or Concurrent !! :)

//1. Using Thread Class
class MyTask extends Thread{ // Simply say extends Thread to Create a Thread
	// Write the task to be executed in run method
	public void run(){ // Override run method of Thread class in Child
		for(int i=1;i<=10;i++){ 
			
			try {
				Thread.sleep(1000); // 1000 milli secs is 1 second
				// sleep is a command which will pause the thread for 1 sec and will re-resume it
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> Printing **LearningPython.pdf** Copy #"+i);
		}
	}
}

class CA{
	
}

//2. Using Runnable Interface
//class YourTask extends CA, Thread{ // error -> Multiple Inheritance is not supported in Java :)
class YourTask extends CA implements Runnable{
	@Override // -> Annotation
	public void run(){ // implement run method of Runnable interface in Class
		for(int i=1;i<=10;i++){ 
			try {
				Thread.sleep(2000); // 2000 milli secs is 2 second
				// sleep is a command which will pause the thread for 1 sec and will re-resume it
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing ##John'sProfile.pdf## Copy #"+i);
		}
	}
}

public class App {

	// main method represents main thread !!
	// whatever we write in the main method is executed in a sequence by main thread of Process
	public static void main(String[] args) {
		
		System.out.println(">> App Started");  // Task1
		
		MyTask mRef = new MyTask();			   // Task1.5
		//mRef.execute();						// my MyTask takes more time to execute tasks of main will be blocked.
		
		System.out.println("^^^ State1 ^^^ "+mRef.getState());
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread yRef = new Thread(r); // In Thread Object we pass ref of runnable i.e. YouTask
		
		mRef.setName("John");
		yRef.setName("Jack");
		Thread.currentThread().setName("Fionna");
		
		// Priority is just a Request. Which may be fulfilled when JVM is Occupied :)
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		yRef.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		mRef.start();	// start method is from Thread class which internally executes run method !!
		
		System.out.println("^^^ State2 ^^^ "+mRef.getState());
		
		try {
			// join is a command. let other wait till my operations are not finished !!
			mRef.join(); // join is executed immediately after start method
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("^^^ State1 ^^^ "+mRef.getState());
		
		yRef.start();   // This will execute run method of YourTask class
		
		for(int i=1;i<=10;i++){ 			   // Task2
			try {
				Thread.sleep(500); // 500 milli secs is .5 second
				// sleep is a command which will pause the thread for 1 sec and will re-resume it
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing ==LearningJava.pdf== Copy #"+i);
		}
		
		System.out.println(">> mRef name is:"+mRef.getName()+" and priority is: "+mRef.getPriority());
		System.out.println(">> yRef name is:"+yRef.getName()+" and priority is: "+yRef.getPriority());
		System.out.println(">> main name is:"+Thread.currentThread().getName()+" and priority is: "+Thread.currentThread().getPriority());
		
		System.out.println(">> App Finished"); // Task3
		
		//States -> NEW | RUNNABLE | TIMED_WAITING | TERMINATED | WAITING* | BLOCKED*
	}

}
