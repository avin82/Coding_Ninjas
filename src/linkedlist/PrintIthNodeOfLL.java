package linkedlist;

import java.util.Scanner;

public class PrintIthNodeOfLL {
	
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
	
	public static void printIth(LinkedListNode<Integer> head, int i) {
		LinkedListNode<Integer> temp = head;
		int count = 0;
		while (temp != null) {
			if (count == i) {
				System.out.println(temp.data);
				return;
			} else {
				count++;
				temp = temp.next;
				if (count == i) {
					System.out.println(temp.data);
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a linked list and a position i, print the node at ith position. 
		 
		 If position i is greater than length of LL, then don't print anything. 
		 
		 Indexing starts from 0. 
		 
		 Input format : 
		 Line 1 : Linked list elements (separated by space and terminated by -1) 
		 Line 2 : Integer i (position) 
		 
		 Output format : 
		 Element at ith position 
		 
		 Sample Input 1 : 
		 3 4 5 2 6 1 9 -1 
		 3 
		 
		 Sample Output 1 : 
		 2 
		 
		 Sample Input 2 : 
		 3 4 5 2 6 1 9 -1 
		 0 
		 
		 Sample Output 2 : 
		 3
		 */
		LinkedListNode<Integer> head = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the position say i to print the element of the linked list at ith position: ");
		int i = scanner.nextInt();
		printIth(head, i);
	}

}
