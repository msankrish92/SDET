package ls.list;

import org.junit.Test;

public class Question40 {

	@Test
	public void example1() {
		String s = "12345"; // Expected 1
		method1(s);
	}

	public void method1(String s) {
		boolean firstPerson = true;
		boolean secondPerson = false;

		QueueImp<Character> queue = new QueueImp<Character>();

		for (Character character : s.toCharArray()) {
			queue.enqueue(character);
		}

//		for (Character ch : queue) {
		while (queue.size() != 1) {

			if (firstPerson) {
				Character dequeue = queue.dequeue();
				queue.enqueue(dequeue);
				firstPerson = false;
				secondPerson = true;
			} else if (secondPerson) {
				queue.dequeue();
				firstPerson = true;
				secondPerson = false;
			}
		}
		System.out.println(queue.peek());
		
	}

}
