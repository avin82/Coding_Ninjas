package linkedlist;

import java.util.Scanner;

public class LengthOfLL {
	
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
			System.out.print(temp.data +" ");
			temp = temp.next;
		} 
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a linked list, find and return the length of input LL iteratively. 
		 
		 Input format : 
		 Linked list elements (separated by space and terminated by -1) 
		 
		 Output format : 
		 Length of LL 
		 
		 Sample Input : 
		 3 4 5 2 6 1 9 -1 
		 
		 Sample Output : 7
		 */
		
		LinkedListNode<Integer> head = takeInput();
		print(head);
		System.out.printf("The length of the entered linked list is %d%n", length(head));
	}

}
