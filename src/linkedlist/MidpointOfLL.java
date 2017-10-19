package linkedlist;

import java.util.Scanner;

public class MidpointOfLL {
	
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
	
	public static int length(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int count = 1;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static int printMiddle(LinkedListNode<Integer> head) {
		int middle = 0;
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;
		if (length(head) % 2 == 0) {
			while (fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			middle = slow.getData();
		} else {
			while (fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			middle = slow.getData();
		}
		return middle;
	}
	
	public static void main(String[] args) {
		/*
		 Given a linked list, find and return the midpoint. 
		 
		 If the length of linked list is even, return the first mid point. 
		 Input format : Linked list elements (separated by space and terminated by -1)` 
		 
		 Sample Input 1 : 
		 1 2 3 4 5 -1 
		 
		 Sample Output 1 : 
		 3 
		 
		 Sample Input 2 : 
		 1 2 3 4 -1 
		 
		 Sample Output 2 : 
		 2
		 */
		LinkedListNode<Integer> head = takeInput();
		System.out.println(printMiddle(head));
	}

}
