package linkedlist;

import java.util.Scanner;

public class EvenAfterOddLL {
	
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
	
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		if (head == null) { 
			return head; 
		} 
		LinkedListNode<Integer> evenHead = null, oddHead = null, evenTail = null, oddTail = null; 
		while (head != null) { 
			if (head.data % 2 == 0) { 
				if (evenHead == null) { 
					evenHead = head; 
					evenTail = head; 
				} else { 
					evenTail.next = head; 
					evenTail = evenTail.next; 
				} 
			} else { 
				if (oddHead == null) { 
					oddHead = head; 
					oddTail = head; 
				} else { 
					oddTail.next = head; 
					oddTail = oddTail.next; 
				} 
			} 
			head = head.next; 
		} 
		if (oddHead == null) { 
			return evenHead; 
		} else { 
			oddTail.next = evenHead; 
		} 
		if (evenHead != null) { 
			evenTail.next = null; 
		} 
		return oddHead;
	}
	
	public static void main(String[] args) {
		/*
		 Arrange elements in a given Linked List such that, all even numbers are placed after odd numbers. 
		 Respective order of elements should remain same. 
		 
		 You don't need to print the elements, instead return the head of updated LL. 
		 
		 Input format : Linked list elements (separated by space and terminated by -1) 
		 
		 Sample Input 1 : 
		 1 4 5 2 -1 
		 
		 Sample Output 1 : 
		 1 5 4 2 
		 
		 Sample Input 2 : 
		 1 11 3 6 8 0 9 -1 
		 
		 Sample Output 2 : 
		 1 11 3 9 6 8 0
		 */
		LinkedListNode<Integer> head = takeInput();
		head = sortEvenOdd(head);
		print(head);
	}

}
