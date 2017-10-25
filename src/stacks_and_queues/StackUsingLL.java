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
		/*
		 You need to implement a Stack class using linked list. 
		 
		 The data members should be private. 
		 
		 Implement the following public functions : 
		 
		 1. Constructor - 
		 Initialises the data member (i.e. head to null). 
		 
		 2. push : 
		 This function should take one argument of type T and has return type void. 
		 This function should insert an element in the stack. Time complexity should be O(1). 
		 
		 3. pop : 
		 This function takes no input arguments and has return type T. This should removes 
		 the last element which is entered and return that element as an answer. Time complexity should be O(1). 
		 
		 4. top : 
		 This function takes no input arguments and has return type T. This should 
		 return the last element which is entered and return that element as an answer. 
		 Time complexity should be O(1). 
		 
		 5. size : 
		 Return the size of stack i.e. count of elements which are present ins stack right now. 
		 Time complexity should be O(1). 
		 
		 6. isEmpty : 
		 Checks if the stack is empty or not. Return true or false.
		 */
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
