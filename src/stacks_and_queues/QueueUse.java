package stacks_and_queues;

public class QueueUse {
	
	public static void main(String[] args) throws QueueFullException {
		QueueUsingArray queue = new QueueUsingArray(3);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
		}
		while (!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
		}
		QueueUsingLL<Integer> queueUsingLL = new QueueUsingLL<>();
		for (int i = 1; i <= 5; i++) {
			queueUsingLL.enqueue(i);
		}
		while (!queueUsingLL.isEmpty()) {
			try {
				System.out.println(queueUsingLL.dequeue());
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
		}
	}

}
