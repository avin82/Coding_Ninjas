package linkedlist;

import java.util.Scanner;

public class FindNodeInLL {
	
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
	
	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		LinkedListNode<Integer> temp = head;
		int index = 0;
		while (temp.next != null) {
			if (temp.data == n) {
				return index;
			} else {
				temp = temp.next;
				index++;
			}
		}
		if (temp.data == n) {
			return index;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a linked list and an integer n you need to find and return index where n is present in the LL. 
		 Do this iteratively. 
		 
		 Return -1 if n is not present in the LL. 
		 
		 Indexing of nodes starts from 0. 
		 
		 Input format : 
		 Line 1 : Linked list elements (separated by space and terminated by -1) 
		 Line 2 : Integer n 
		 
		 Output format : 
		 Index 
		 
		 Sample Input 1 : 
		 3 4 5 2 6 1 9 -1 
		 5 
		 
		 Sample Output 1 : 
		 2 
		 
		 Sample Input 2 : 
		 3 4 5 2 6 1 9 -1 
		 6 
		 
		 Sample Output 2 : 
		 4
		 */
		LinkedListNode<Integer> head = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer n to return the index where "
				+ "n is present in the linked list: ");
		int n = scanner.nextInt();
		System.out.printf("The index of %d in the linked list is %d%n", n, indexOfNIter(head, n));
	}
}
