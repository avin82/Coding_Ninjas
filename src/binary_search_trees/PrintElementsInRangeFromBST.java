package binary_search_trees;

import java.util.Scanner;

import binary_trees.BinaryTreeNode;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class PrintElementsInRangeFromBST {
	
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
	
	public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if (root == null) {
			return;
		} 
		if (root.data > k2) {
			printNodeFromK1ToK2(root.left, k1, k2);
		} else if (root.data < k1) {
			printNodeFromK1ToK2(root.right, k1, k2);
		}
		if (root.data >= k1 && root.data <= k2) {
			if (root.data != k1) {
				printNodeFromK1ToK2(root.left, k1, k2);
			}
			System.out.print(root.data + " ");
			if (root.right != null) {
				printNodeFromK1ToK2(root.right, k1, k2);
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a Binary Search Tree and two integers k1 and k2, find and print the elements 
		 which are in range k1 and k2 (both inclusive). 
		 Print the elements in increasing order. 
		 
		 Input format : 
		 Line 1 : Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 Line 2 : Two Integers k1 and k2 
		 
		 Output Format : 
		 Required elements (separated by space) 
		 
		 Sample Input : 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 
		 6 10 
		 
		 Sample Output : 
		 6 7 8 10
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two elements k1 and k2 separated by space which define the "
				+ "minimum and maximum of a range respectively: ");
		int k1 = scanner.nextInt();
		int k2 = scanner.nextInt();
		printNodeFromK1ToK2(root, k1, k2);
	}

}
