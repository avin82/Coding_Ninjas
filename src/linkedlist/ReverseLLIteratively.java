package linkedlist;

import java.util.Scanner;

public class ReverseLLIteratively {
	
	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the elements of the linked list separated by space or return: ");
		int data = scanner.nextInt();
		while (data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = scanner.nextInt();
		}
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} 
		System.out.println();
	}
	
	public static LinkedListNode<Integer> reverseLLIterative(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> previous = null;
		LinkedListNode<Integer> temp;
		while (current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		return previous;
	}
	public static void main(String[] args) {
		/*
		 Given a linked list, reverse it iteratively. 
		 
		 You don't need to print the elements, just reverse the LL duplicates and return the head of updated LL. 
		 
		 Input format : Linked list elements (separated by space and terminated by -1)` 
		 
		 Sample Input 1 : 
		 1 2 3 4 5 -1 
		 
		 Sample Output 1 : 
		 5 4 3 2 1
		 */
		LinkedListNode<Integer> head = takeInput();
		head = reverseLLIterative(head);
		print(head);
	}

}
