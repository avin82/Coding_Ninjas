package linkedlist;

import java.util.Scanner;

public class SkipMDeleteNNodes {
	
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
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> temp2 = null;
		while (temp != null) {
			int i = 1, j = 0;
			while (i < M && temp.next != null) {
				temp = temp.next;
				i++;
			}
			temp2 = temp;
			while (j < N && temp2.next != null) {
				temp2 = temp2.next;
				j++;
			}
			temp.next = temp2.next;
			temp = temp.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		/*
		 Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes 
		 then delete next N nodes, continue the same until end of the linked list. That is, in the given 
		 linked list you need to delete N nodes after every M nodes. 
		 
		 Input format : 
		 Line 1 : Linked list elements (separated by space and terminated by -1) 
		 Line 2 : M 
		 Line 3 : N 
		 
		 Sample Input 1 : 
		 1 2 3 4 5 6 7 8 -1 
		 2 
		 2 
		 
		 Sample Output 1 : 
		 1 2 5 6 
		 
		 Sample Input 2 : 
		 1 2 3 4 5 6 7 8 -1 
		 2 
		 3 
		 
		 Sample Output 2 : 
		 1 2 6 7
		 */
		LinkedListNode<Integer> head = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter two integers m and n such that while traversing "
				+ "the linked list m nodes are retained and next n nodes are deleted till end of list: ");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		head = skipMdeleteN(head, m, n);
		print(head);
	}

}
