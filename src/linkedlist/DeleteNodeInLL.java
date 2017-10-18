package linkedlist;

import java.util.Scanner;

public class DeleteNodeInLL {
	
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
	
	public static int length(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int count = 1;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i) {
		LinkedListNode<Integer> temp = head;
		if (i == 0) {
			temp = temp.next;
			return temp;
		} else if (i == length(head)) {
			int j = 0;
			while (j < i) {
				temp = temp.next;
				j++;
			}
			temp.next = null;
		} else if (i > length(head)) {
			return temp;
		} else {
			int k = 1;
			while (k < i) {
				temp = temp.next;
				k++;
			}
			temp.next = temp.next.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a linked list and a position i, delete the node of ith position from Linked List iteratively. 
		 
		 If position i is greater than length of LL, then you should return the same LL without any change. 
		 
		 Indexing starts from 0. You don't need to print the elements, just delete the node and 
		 return the head of updated LL. 
		 
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
		System.out.print("Please enter a position say i for which you want to "
				+ "delete the node of the linked list at ith position: ");
		int i = scanner.nextInt();
		System.out.print("Linked list before deleting node: ");
		print(head);
		head = deleteIthNode(head, i);
		System.out.print("Linked list after deleting node: ");
		print(head);
	}

}
