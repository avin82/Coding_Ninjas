package binary_trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class MirrorABinaryTree {
	
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
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = null;
			try {
				frontNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
			System.out.print(frontNode.data + ":");
			if (frontNode.left != null) {
				pendingNodes.enqueue(frontNode.left);
				System.out.print("L:" + frontNode.left.data + ",");
			} else {
				System.out.print("L:" + "-1" + ",");
			}
			if (frontNode.right != null) {
				pendingNodes.enqueue(frontNode.right);
				System.out.print("R:" + frontNode.right.data);
				System.out.println();
			} else {
				System.out.print("R:" + "-1");
				System.out.println();
			}
		}
	}
	
	public static void mirror(BinaryTreeNode<Integer> root) {
		if (root == null || root.left == null && root.right == null) {
			return;
		} 
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirror(root.left);
		mirror(root.right);
	}
	
	public static void main(String[] args) {
		/*
		 Mirror the given binary tree. That is, right child of every nodes should become 
		 left and left should become right. 
		 
		 Note : You don't need to print or return the tree, just mirror it. 
		 
		 Input format : 
		 Line 1 : Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 Output format : Elements in level order form (Every level in new line) 
		 
		 Sample Input 1: 
		 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1 
		 
		 Sample Output 1: 
		 1 
		 3 2 
		 7 6 5 4 
		 
		 Sample Input 1: 
		 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1 
		 
		 Sample Output 1: 
		 5 
		 6 10 
		 3 2 
		 9
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		mirror(root);
		printLevelWise(root);
	}

}
