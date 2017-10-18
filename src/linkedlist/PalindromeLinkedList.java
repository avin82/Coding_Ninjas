package linkedlist;

import java.util.Scanner;

import javax.xml.transform.Source;

public class PalindromeLinkedList {
	
	public static LinkedListNode<Integer> reversed;
	public static LinkedListNode<Integer> reversedFirst;
	public static int count = 0;
	
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
	
	public static LinkedListNode<Integer> reverseLLRecursively(LinkedListNode<Integer> root) {
		LinkedListNode<Integer> head = root;
		LinkedListNode<Integer> temp = head;
		if (length(root) == 1) {
			reversedFirst = root;
			return reversedFirst;
		} else if (head.next == null) {
			reversed.next = head;
			return reversedFirst;
		} 
			while (head.next.next != null) {
				head = head.next;
				count++;
			}
			reversed = new LinkedListNode<Integer>(head.next.getData());
			if (count == 1) {
				reversedFirst = reversed;
			}
			head.next = null;	
			reversed.next = reverseLLRecursively(temp);
			return reversedFirst;
	}
	
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
		boolean isLLPalindrome = false;
		if (length(head) == 1) {
			isLLPalindrome = true;
			return isLLPalindrome;
		}
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> firstNode = temp;
		int mid = length(head) / 2;
		int count = 1;
		while (count <= mid) {
			temp = temp.next;
			count++;
		}
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(temp.next.getData());
		LinkedListNode<Integer> secondLLFirstNode = newNode;
		temp.next = null;
		while (newNode.next != null) {
			LinkedListNode<Integer> nextNode = new LinkedListNode<Integer>(newNode.next.getData());
			newNode.next = nextNode;
		}
		secondLLFirstNode = reverseLLRecursively(secondLLFirstNode);
		while (firstNode.next != null && secondLLFirstNode.next != null) {
			if (firstNode.getData() != secondLLFirstNode.getData()) {
				isLLPalindrome = false;
				break;
			} else {
				isLLPalindrome = true;
				firstNode = firstNode.next;
				secondLLFirstNode = secondLLFirstNode.next;
			}
		}
		if (firstNode.next == null || secondLLFirstNode.next == null) {
			if (firstNode.getData() == secondLLFirstNode.getData()) {
				isLLPalindrome = true;
			}
		}
		return isLLPalindrome;
	}
	
	public static void main(String[] args) {
		/*
		 Check if a given linked list is palindrome or not. Return true or false. 
		 
		 Indexing starts from 0. 
		 
		 Input format : Linked list elements (separated by space and terminated by -1)` 
		 
		 Sample Input 1 : 
		 9 2 3 3 2 9 -1 
		 
		 Sample Output 1 : 
		 true 
		 
		 Sample Input 2 : 
		 0 2 3 2 5 -1 
		 
		 Sample Output 2 : 
		 false
		 */
		LinkedListNode<Integer> head = takeInput();
		System.out.println(isPalindrome_2(head));
	}

}
