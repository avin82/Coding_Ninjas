package linkedlist;

import java.util.Scanner;

public class DeleteRecursively {
	
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
	
	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i) {
		if (i == 0) {
			return head.next;
		} 
		if (head.next == null) {
			return head;
		}
		head.next = deleteIthNodeRec(head.next, i - 1);
		return head;
	}
	
	public static void main(String[] args) {
		/*
		 Given a linked list and a position i, delete the node of ith position from Linked List recursively. 
		 
		 If position i is greater than length of LL, then you should return the same LL without any change. 
		 
		 Indexing starts from 0. You don't need to print the elements, just delete the node and return 
		 the head of updated LL. 
		 
		 Input format : 
		 Line 1 : Linked list elements (separated by space and terminated by -1) 
		 Line 2 : Integer i (position) 
		 
		 Output format : 
		 Updated LL elements (separated by space) 
		 
		 Sample Input 1 : 
		 3 4 5 2 6 1 9 -1 
		 3 
		 
		 Sample Output 1 : 
		 3 4 5 6 1 9 
		 
		 Sample Input 2 : 
		 3 4 5 2 6 1 9 -1 
		 0 
		 
		 Sample Output 2 : 
		 4 5 2 6 1 9
		 */
		LinkedListNode<Integer> head = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the position of the element which needs to be deleted "
				+ "from the linked list: ");
		int i = scanner.nextInt();
		head = deleteIthNodeRec(head, i);
		print(head);
	}

}
