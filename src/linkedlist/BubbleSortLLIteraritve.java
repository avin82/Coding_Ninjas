package linkedlist;

import java.util.Scanner;

import generics.Print;

public class BubbleSortLLIteraritve {
	
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
	
	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} 
		System.out.println();
	}
	
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		int n = length(head); 
		for (int i = 0; i < n - 1; i++) { 
			LinkedListNode<Integer> prev = null; 
			LinkedListNode<Integer> curr = head; 
			for (int j = 0; j < n - i - 1; j++) { 
				if (curr.data <= curr.next.data) { 
					prev = curr; curr = curr.next; 
				} else { 
					if (prev == null) { 
						LinkedListNode<Integer> fwd = curr.next; 
						head = head.next; 
						curr.next = fwd.next; 
						fwd.next = curr; 
						prev = fwd; 
					} else { 
						LinkedListNode<Integer> fwd = curr.next; 
						prev.next = fwd; 
						curr.next = fwd.next; 
						fwd.next = curr; 
						prev = fwd; 
					} 
				} 
			} 
		} 
		return head;
	}
	
	public static void main(String[] args) {
		/*
		 Sort a given linked list using Bubble Sort (iteratively). While sorting, you need to 
		 swap the entire nodes, not just the data. 
		 
		 You don't need to print the elements, just sort the elements and return the head of updated LL. 
		 Input format : Linked list elements (separated by space and terminated by -1)
		 
		 Sample Input 1 : 
		 1 4 5 2 -1 
		 
		 Sample Output 1 : 
		 1 2 4 5
		 */
		LinkedListNode<Integer> head = takeInput();
		head = bubbleSort(head);
		print(head);
	}

}
