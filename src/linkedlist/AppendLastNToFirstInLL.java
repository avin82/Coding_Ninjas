package linkedlist;

import java.util.Scanner;

public class AppendLastNToFirstInLL {
	
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
	
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
		int value = length(root) - n;
		LinkedListNode<Integer> temp = root;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = root;
		int count = 0;
		while (count < value) {
			temp = temp.next;
			count++;
		}
		LinkedListNode<Integer> head = temp.next;
		temp.next = null;
		return head;
	}
	
	public static void main(String[] args) {
		/*
		 Given a linked list and an integer n, append the last n elements of the LL to front. 
		 
		 Indexing starts from 0. You don't need to print the elements, just update the elements 
		 and return the head of updated LL. 
		 
		 Assume given n will be smaller than length of LL. 
		 
		 Input format : 
		 Line 1 : Linked list elements (separated by space and terminated by -1)` 
		 
		 Sample Input 1 : 
		 1 2 3 4 5 -1 
		 3 
		 
		 Sample Output 1 : 
		 3 4 5 1 2
		 */
		LinkedListNode<Integer> head = takeInput();	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer n to append the last n elements of "
				+ "linked list to front: ");
		int n = scanner.nextInt();
		head = append(head, n);
		print(head);
	}

}
