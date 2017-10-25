package stacks_and_queues;

import java.util.Scanner;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLL() {
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
	
	public static void main(String[] args) {
		/*
		 You need to implement a Queue class using linked list. 
		 
		 All the required data members should be private. 
		 
		 Implement the following public functions : 
		 
		 1. Constructor - 
		 Initialises the data members. 
		 
		 2. enqueue : 
		 This function should take one argument of type T and has return type void. 
		 This function should insert an element in the queue. Time complexity should be O(1). 
		 
		 3. dequeue : 
		 This function takes no input arguments and has return type T. This should 
		 removes the first element which is entered and return that element as an answer. 
		 Time complexity should be O(1). 
		 
		 4. front : 
		 This function takes no input arguments and has return type T. This should return the 
		 first element which is entered and return that element as an answer. Time complexity should be O(1). 
		 
		 5. size : 
		 Return the size of stack i.e. count of elements which are present ins stack right now. 
		 Time complexity should be O(1). 
		 
		 6. isEmpty : 
		 Checks if the queue is empty or not. Return true or false.
		 */
		Scanner scanner = new Scanner(System.in);

		QueueUsingLL<Integer> queueUsingLL = new QueueUsingLL<>();

		int choice = scanner.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = scanner.nextInt();
				queueUsingLL.enqueue(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(queueUsingLL.dequeue());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(queueUsingLL.front());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(queueUsingLL.size());
			}
			else if(choice == 5) {
				System.out.println(queueUsingLL.isEmpty());
			}
			choice = scanner.nextInt();
		}
	}

}
