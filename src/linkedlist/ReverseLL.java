package linkedlist;

import java.util.Scanner;

public class ReverseLL {
	
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
	
	public static LinkedListNode<Integer> reverseLLRecursively(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> h = head;
		LinkedListNode<Integer> temp = h;
		if (h.next == null) {
			return h;
		}
		while (h.next.next != null) {
			h = h.next;
		}
		LinkedListNode<Integer> tempHead = h.next;
		h.next = null;
		tempHead.next = reverseLLRecursively(temp);
		return tempHead;
	}
	
	public static void main(String[] args) {
		/*
		 Given a linked list, reverse it using recursion. 
		 
		 You don't need to print the elements, just reverse the LL duplicates and return the head of updated LL. 
		 
		 Input format : Linked list elements (separated by space and terminated by -1)` 
		 
		 Sample Input 1 : 
		 1 2 3 4 5 -1 
		 
		 Sample Output 1 : 
		 5 4 3 2 1
		 */
		LinkedListNode<Integer> head = takeInput();
		print(head);
		head = reverseLLRecursively(head);
		print(head);
	}

}
