package linkedlist;

import java.util.Scanner;

public class InsertRecursively {
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the elements of the linked list separated by space or return: ");
		int data = scanner.nextInt();
		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
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
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		} 
		System.out.println();
	}
	
	public static Node<Integer> insertRecurisive(Node<Integer> head, int pos, int element) {
		if (pos == 0) {
			Node<Integer> newNode = new Node<Integer>(element);
			newNode.next = head;
			return newNode;
		}
		head.next = insertRecurisive(head.next, pos - 1, element);
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the position where the element needs to be inserted and the element "
				+ "to be inserted separated by space or return: ");
		int pos = scanner.nextInt();
		int element = scanner.nextInt();
		head = insertRecurisive(head, pos, element);
		print(head);
	}

}
