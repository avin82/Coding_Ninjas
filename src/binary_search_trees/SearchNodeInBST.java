package binary_search_trees;

import java.util.Scanner;

import binary_trees.BinaryTreeNode;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class SearchNodeInBST {
	
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
	
	public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k) {
		if (root == null) {
			return null;
		} else if (k == root.data) {
			return root;
		} else if (k > root.data) {
			return searchInBST(root.right, k);
		} else {
			return searchInBST(root.left, k);
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a BST and an integer k. Find if the integer k is present in given BST or not. 
		 Return the node with data k if it is present, return null otherwise. 
		 Assume that BST contains all unique elements. 
		 
		 Input Format : 
		 Line 1 : Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 Line 2 : Integer k 
		 
		 Output Format : 
		 Node with data k 
		 
		 Sample Input 1 : 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 
		 2 
		 
		 Sample Output 1 : 
		 2 
		 
		 Sample Input 2 : 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 
		 12 
		 
		 Sample Output 2 : 
		 (empty)
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer say k which needs to be found in the given binary search tree: ");
		int k = scanner.nextInt();
		if (searchInBST(root, k) == null) {
			System.out.printf("Element %d not found in given binary search tree.%n", k);
		} else {
			System.out.println(searchInBST(root, k).data);
		}	
	}
}
