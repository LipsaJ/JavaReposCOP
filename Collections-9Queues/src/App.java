import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
	
	public static void main(String[] args) {
		
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		//no such element exception
		//System.out.println("Head of the queue is: "+q1.element());
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Head of the queue is: "+q1.element());
		
		/* this is a runtime exception: 
		q1.add(40);
		
		since the size is 3 and we are adding 4 , this is the exception -  java.lang.IllegalStateException , we can handle like below 
		*/
		
		try{
			q1.add(40);	
		} catch(IllegalStateException e) {
			System.out.println("Tried to add too many to the queue");
		}
		
		for(Integer value: q1){
			System.out.println("Queue value is: " + value);
		}
		
		System.out.println("Removed value from queue is: " +q1.remove());
		System.out.println("Removed value from queue is: " +q1.remove());
		System.out.println("Removed value from queue is: " +q1.remove());
		
		try {
			
			System.out.println("Removed value from queue is: " +q1.remove());
			
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many values from the queue");
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		//no such element exception
		//System.out.println("Head of the queue is: "+q1.element());
		System.out.println("Queue 2 peak is: " +q2.peek());
		q2.offer(10);
		q2.offer(20);
		System.out.println("Queue 2 peak is: " +q2.peek());
		//no exception here
		//q2.offer(30);
		
		if (q2.offer(30) == false)
			System.out.println("Offer failed to add third item");
		
		System.out.println("Queue2 poll: " +q2.poll());
		System.out.println("Queue2 poll: " +q2.poll());
		System.out.println("Queue2 poll: " +q2.poll());
		
		//so add throws exception in case of more elements but offer just returns a null, similarly poll returns null unlike
		//remove which throws exception, same with peak as well, it will send null if there is nothing in head
	}

}
