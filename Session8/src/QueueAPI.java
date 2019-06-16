import java.util.PriorityQueue;

public class QueueAPI {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// Queue : 	(Head)10 9 8 7 6 5 4 3 2 1(Tail) | How we created it !!
		// PriorityQueue will sort the data automatically
		// Queue : 	(Head)1 2 3 4 5 6 7 8 9 10(Tail) | Actual Queue as data will be sorted

		// peek() : Head of Queue
		// poll() : Remove Head of Queue
		
		//System.out.println(">> Head is: "+queue.peek()+" size is: "+queue.size());
		//queue.poll();
		//System.out.println(">> Head now is: "+queue.peek()+" size is: "+queue.size());
		
		// When you will poll queue.size() decreases :) | 1 2 3 4 5 :) 
		for(int i=0;i<queue.size();i++){
			System.out.println(">> Head is: "+queue.peek());	// Reading Head of Queue
			queue.poll();										// Removing Head of Queue
		}
	}

}
