package javapractice;
import java.util.Iterator;
import java.util.PriorityQueue;
/**
 * @author 
 * Priority Queue keeps the Queue Sorted automatically
 *
 */
public class PQueueOperations {

	public static void main(String args[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for(int i=10;i>=1;i--) {
			pq.add(i);
		}
		// Queue :- 10 9 8 7 6 5 4 3 2 1
		//PriorityQueue Sorted the queue like 1 2 3 4 5 6 7 8 9 10

		Iterator it = pq.iterator();
		while(it.hasNext())
		{
			System.out.print(" "+it.next());
		}
		//Peeking :- Obtianing the head value
		//polling:- Removing the head value
		System.out.println("\nSize of queue "+pq.size());

		System.out.println("Obtain head value "+pq.peek());

		System.out.println("Remove head value "+pq.remove());

		System.out.println("Size of the Queue "+pq.size());

		while(it.hasNext())
		{
			System.out.print(" "+it.next());
		}

	}

}
