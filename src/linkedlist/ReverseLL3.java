package linkedlist;

import java.util.Scanner;

public class ReverseLL3 {
	
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
	
	public static Node<Integer> reverseLLR(Node<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> reversedTail = head.next;
		Node<Integer> smallHead = reverseLLR(head.next);
		reversedTail.next = head;
		head.next = null;
		return smallHead;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = reverseLLR(head);
		print(head);
	}

}
