package linkedlist;

import java.util.Scanner;

public class KReverse {
	
	public static int x = 1;
	
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
	
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = null; 
		LinkedListNode<Integer> prev = null; 
		int count = 0; 
		/* Reverse first k nodes of linked list */ 
		while (count < k && current != null) { 
			next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
			count++; 
		} 
		if (next != null) { 
			head.next = kReverse(next, k); 
		} 
		return prev;
	}
	
	public static void main(String[] args) {
		/*
		 Implement kReverse( int k ) in a linked list i.e. you need to reverse first K elements then 
		 reverse next k elements and join the linked list and so on. 
		 
		 Indexing starts from 0. If less than k elements left in the last, you need to reverse them as well. 
		 If k is greater than length of LL, reverse the complete LL. 
		 
		 You don't need to print the elements, just return the head of updated LL. 
		 
		 Input format : 
		 Line 1 : Linked list elements (separated by space and terminated by -1) 
		 Line 2 : k 
		 
		 Sample Input 1 : 
		 1 2 3 4 5 6 7 8 9 10 -1 
		 4 
		 
		 Sample Output 1 : 
		 4 3 2 1 8 7 6 5 10 9 
		 
		 Sample Input 2 : 
		 1 2 3 4 5 -1 
		 2 
		 
		 Sample Output 2 : 
		 2 1 4 3 5 
		 
		 Sample Input 3 : 
		 1 2 3 4 5 6 7 -1 
		 3 
		 
		 Sample Output 3 : 
		 3 2 1 6 5 4 7
		 */
		LinkedListNode<Integer> head = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number say k by which first k elements of "
				+ "the linked list needs to be reversed and then the next k elements "
				+ "reversed and so on: ");
		int k = scanner.nextInt();
		head = kReverse(head, k);
		print(head);
	}

}
