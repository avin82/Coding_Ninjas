package binary_search_trees;

import java.util.Scanner;

import binary_trees.BinaryTreeNode;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class LCAOfBST {
	
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
	
	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b) {
		if (root == null) {
			return -1;
		}
		if (root.data == a || root.data == b) {
			return root.data;
		} 
		int c = lcaInBST(root.left, a, b);
		int d = lcaInBST(root.right, a, b);
		if (c == -1 && d != -1) {
			return d;
		} else if (c != -1 && d == -1) {
			return c;
		} else if (c == -1 && d == -1) {
			return -1;
		} else {
			return root.data;
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a binary search tree and two nodes, find LCA(Lowest Common Ancestor) of the 
		 given two nodes in the BST. Read about LCA if you are having doubts about the definition. 
		 
		 If out of 2 nodes only one node is present, return that node. 
		 If both are not present, return -1. 
		 
		 Input format : 
		 Line 1 : Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 Line 2 : Two integers, Node 1 and Node 2 (separated by space) 
		 
		 Output Format : 
		 LCA 
		 
		 Constraints : 
		 1 <= N <= 1000 
		 
		 Sample Input 1: 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 
		 2 10 
		 
		 Sample Output 1: 
		 8 
		 
		 Sample Input 2: 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 
		 2 6 
		 
		 Sample Output 2: 
		 5 
		 
		 Sample Input 3: 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 
		 12 78 
		 
		 Sample Output 3: 
		 -1
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter data for two nodes separated by space for which LCA is to be found: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(lcaInBST(root, a, b));
	}

}
