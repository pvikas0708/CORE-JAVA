package in.vikas;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Que_Demo {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("john");
		queue.add("smith");
		queue.add("orlen");
		queue.add("charles");

		System.out.println(queue);// printing data available in queue

		System.out.println(queue.element());// to access element of collection
		System.out.println(queue.peek());// to get head element=> Charles

		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		queue.remove();// Retrieves head of queue
		queue.poll();// Retrieves head of queue

	}
}
