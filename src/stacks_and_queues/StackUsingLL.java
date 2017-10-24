package stacks_and_queues;

import java.util.Scanner;

class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		next = null;
	}
}

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public T top() throws StackEmptyException {
		if (size() == 0) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void push(T data) {
		Node<T> temp = head;
		head = new Node(data);
		head.next = temp;
		size++;
	}
	
	public T pop() throws StackEmptyException {
		if (size() == 0) {
			StackEmptyException emptyException = new StackEmptyException();
			throw emptyException;
		}
		Node<T> temp = head;
		head = head.next;
		size--;
		return temp.data;	
	}
	
	public static void main(String[] args) throws StackEmptyException {
		Scanner scanner = new Scanner(System.in);
        StackUsingLL<Integer> stackLL = new StackUsingLL<Integer>();
        int choice = scanner.nextInt();
        int input;
        if (choice == 1) {
            input = scanner.nextInt();
            stackLL.push(input);
        }
        else if (choice == 2) {
            System.out.println(stackLL.pop());
        }
        else if (choice == 3) {
            System.out.println(stackLL.top());
        }
        else if (choice == 4) {
        	System.out.println(stackLL.size());
        }
        else if (choice == 5) {
        	System.out.println(stackLL.isEmpty());
        }
        else {
            return;
        }
    	}
}
