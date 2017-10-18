package linkedlist;

import java.util.Scanner;

public class PrintReverseLL {
	
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
	
	public static void printReverseRecursive(LinkedListNode<Integer> root) {
		LinkedListNode<Integer> head = root;
		LinkedListNode<Integer> temp = head;
		if (head.next == null) {
			System.out.println(head.getData());
			return;
		} else {
			while (head.next.next != null) {
				head = head.next;
			}
			System.out.print(head.next.getData() + " ");
			head.next = null;
			printReverseRecursive(temp);
		}
	}
	
	public static void main(String[] args) {
		/*
		 Print a given linked list in reverse order. You need to print the tail first and head last. 
		 You can’t change any pointer in the linked list, just print it in reverse order. 
		 
		 Input format : Linked List elements (separated by space and terminated by -1) 
		 Output format : Linked List elements in reverse order (separated by space) 
		 
		 Sample Input 1 : 
		 1 2 3 4 5 -1 
		 
		 Sample Output 1 : 
		 5 4 3 2 1 
		 
		 Sample Input 2 : 
		 1 2 3 -1 
		 
		 Sample Output 2 : 
		 3 2 1
		 */
		LinkedListNode<Integer> head = takeInput();
		print(head);
		printReverseRecursive(head);
	}

}
