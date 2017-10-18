package linkedlist;

import java.util.Scanner;

public class InsertNodeInLL {
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the elements of the linked list separated by space or return: ");
		int data = scanner.nextInt();
		while (data != -1) {
			Node<Integer> newNode = new Node(data);
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
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
		Node<Integer> newNode = new Node<Integer>(data);
		if (pos == 0) {
			newNode.next = head;
			return newNode;
		}
		int i = 0;
		Node<Integer> temp = head;
		while (i < pos - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the element to be inserted in the linked list "
				+ "along with the position of the insertion separated by space: ");
		int data = scanner.nextInt();
		int pos = scanner.nextInt();
		System.out.print("Linked list before inserting node: ");
		print(head);
		head = insert(head, data, pos);
		System.out.print("Linked list after inserting node: ");
		print(head);
	}

}
