package algo1223;

import java.util.LinkedList;
import java.util.ListIterator;

public class Code06_Queue {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();
		
		queue.offer(11);
		queue.offer(22);
		queue.offer(33);
		queue.offer(44);
		queue.offer(55);
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		
		ListIterator<Integer> it = queue.listIterator();
		
		if(it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.previous());
			System.out.println(it.previous());
		}
		
		
	}
}
