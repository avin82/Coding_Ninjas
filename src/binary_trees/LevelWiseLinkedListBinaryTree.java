package binary_trees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}

public class LevelWiseLinkedListBinaryTree {
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner scanner = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data: ");
		int rootData = scanner.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = null;
			try {
				frontNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + frontNode.data + ": ");
			int leftCild = scanner.nextInt();
			if (leftCild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftCild);
				pendingNodes.enqueue(child);
				frontNode.left = child;
			}
			System.out.println("Enter right child of " + frontNode.data + ": ");
			int rightChild = scanner.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				frontNode.right = child;
			}
		}
		return root;
	}
	
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		ArrayList<Node<BinaryTreeNode<Integer>>> output = new ArrayList<>();
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = null;
			int counter = pendingNodes.size();
			Node<BinaryTreeNode<Integer>> head = null, tail = null;
			for (int i = 0; i < counter; i++) {
				try {
					currentNode = pendingNodes.dequeue();
				} catch (QueueEmptyException e) {
					e.printStackTrace();
				}
				if (currentNode != null) {
					if (head == null) {
						head = new Node(currentNode);
						tail = head;
					} else {
						tail.next = new Node(currentNode);
						tail = tail.next;
					}
					if (currentNode.left != null) {
						pendingNodes.enqueue(currentNode.left);
					}
					if (currentNode.right != null) {
						pendingNodes.enqueue(currentNode.right);
					}
				} else {
					output.add(head);
					head = null;
					tail = null;
					if (!pendingNodes.isEmpty()) {
						pendingNodes.enqueue(null);
					}
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		/*
		 Given a binary tree, write code to create a separate linked list for each level. 
		 You need to return the array which contains head of each level linked list. 
		 
		 Input format : 
		 Elements in level order form (separated by space). If any node does not have left or right child, 
		 take -1 in its place. 
		 Output format : Each level linked list is printed in new line (elements separated by space). 
		 
		 Sample Input : 
		 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1 
		 
		 Sample Output : 
		 5 
		 6 10 
		 2 3 
		 9
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		ArrayList<Node<BinaryTreeNode<Integer>>> list = LLForEachLevel(root);
		for (int i = 0; i < list.size(); i++) {
			Node<BinaryTreeNode<Integer>> temp = list.get(i); 
			while(temp != null) {
				System.out.print(temp.data.data + " ");
				temp = temp.next;
				}
			System.out.println();
		}
	}
}
