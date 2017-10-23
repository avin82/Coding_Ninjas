package linkedlist;

import java.util.Scanner;

public class SwapNodesOfLL {
	
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
	
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
		LinkedListNode<Integer> temp = head, prev = null; 
		LinkedListNode<Integer> node1 = null, node2 = null, node1_prev = null, node2_prev = null; 
		int pos = 0; 
		while(temp != null) { 
			if(pos == i) { 
				node1_prev = prev; 
				node1 = temp; 
			} else if (pos == j) { 
				node2_prev = prev; 
				node2 = temp; 
			} 
			prev = temp; 
			temp = temp.next; 
			pos++; 
		} 
		if(node1_prev != null) { 
			node1_prev.next = node2; 
		} else { 
			head = node2; 
		} 
		if(node2_prev != null) { 
			node2_prev.next = node1; 
		} else { 
			head = node1; 
		} 
		LinkedListNode<Integer> temp1 = node2.next; 
		node2.next = node1.next; 
		node1.next = temp1; 
		return head;
	}
	
	public static void main(String[] args) {
		/*
		 Given a linked list, i & j, swap the nodes that are present at i & j position in the LL. 
		 You need to swap the entire nodes, not just the data. 
		 
		 Indexing starts from 0. You don't need to print the elements, just swap and return the head of updated LL. 
		 
		 Assume i & j given will be within limits. And i can be smaller than j also. 
		 
		 Input format : 
		 Line 1 : Linked list elements (separated by space and terminated by -1) 
		 Line 2 : i and j (separated by space) 
		 
		 Sample Input 1 : 
		 3 4 5 2 6 1 9 -1 
		 3 4 
		 
		 Sample Output 1 : 
		 3 4 5 6 2 1 9 
		 
		 Sample Input 2 : 
		 3 4 5 2 6 1 9 -1 
		 2 4 
		 
		 Sample Output 2 : 
		 3 4 6 2 5 1 9
		 */
		LinkedListNode<Integer> head = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter two positions i and j for which the nodes in the linked list "
				+ "need to be swapped: ");
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		head = swap_nodes(head, i, j);
		print(head);
	}

}
