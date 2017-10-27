package stacks_and_queues;

import java.util.Scanner;

class Queue<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public Queue() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public T front() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public void enqueue(T element) {
		if (size == 0) {
			front = new Node(element);
			rear = front;
			size++;
		} else {
			rear.next = new Node(element);
			rear = rear.next;
			size++;
		}
	}
	
	public T dequeue() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		size--;
		if (size == 0) {
			front = null;
			rear = null;
		}
		return temp;
	}
}

public class ReverseQueue {
	
	public static void reverseQueue(Queue<Integer> q) throws QueueEmptyException {
		int[] temp = new int[q.size()];
		int limiter = q.size();
		for (int i = 0; i < limiter; i++) {
			temp[i] = q.dequeue();
		}
		for (int i = temp.length - 1; i >= 0; i--) {
			q.enqueue(temp[i]);
		}
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		/*
		 Given a queue of integers, reverse it without help of any explicit stack or queue. 
		 You need to change in the given queue itself. 
		 
		 Note : No need to return or print the queue. 
		 
		 Input format : 
		 Line 1 : Size of Queue 
		 Line 2 : Queue elements (separated by space) 
		 
		 Output format : 
		 Queue elements 
		 
		 Sample Input : 
		 4 
		 1 2 3 4 (1 is at front) 
		 
		 Sample Output : 
		 4 3 2 1 (4 is at front)
		 */
		Queue<Integer> queue = new Queue();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the queue: ");
		int n = scanner.nextInt();
		System.out.print("Please enter the queue elements separated by space: ");
		for (int i = 0; i < n; i++) {
			queue.enqueue(scanner.nextInt());
		}
		reverseQueue(queue);
		while (!queue.isEmpty()) {
			try {
				System.out.print(queue.dequeue() + " ");
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
		}
	}

}
