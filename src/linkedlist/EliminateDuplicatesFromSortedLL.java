package linkedlist;

import java.util.Scanner;

public class EliminateDuplicatesFromSortedLL {
	
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
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		if (length(head) == 1) {
			return head;
		}
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> temp2 = temp;
		int data = 0;
		while (temp.next != null) {
			data = temp.getData();	// 1, 2, 3
			if (data != temp.next.getData()) {
				temp = temp.next; // 2, 3
			} else {	
				if (temp.next.next == null) {
					temp.next = null;
					break;
				}
				LinkedListNode<Integer> temp3 = temp;	// 4
				temp3 = temp3.next;
				while (data == temp3.getData()) {
					 if (temp3.next == null) {
						temp.next = null;
						break;
					}
					temp3 = temp3.next;
				}
				temp.next = temp3;
			}
		}
		return temp2;
	}
	
	public static void main(String[] args) {
		/*
		 Given a sorted linked list (elements are sorted in ascending order). Eliminate duplicates 
		 from the given LL, such that output LL contains only unique elements. 
		 
		 You don't need to print the elements, just remove duplicates and return the head of updated LL. 
		 
		 Input format : Linked list elements (separated by space and terminated by -1) 
		 
		 Sample Input 1 : 
		 1 2 3 3 3 4 4 5 5 5 7 -1 
		 
		 Sample Output 1 : 
		 1 2 3 4 5 7
		 */
		LinkedListNode<Integer> head = takeInput();
		print(head);
		head = removeDuplicates(head);
		print(head);
	}

}
