package binary_trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class SumOfAllNodesOfBinaryTree {
	
	public static int sum = 0;
	
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
	
	public static int sum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		sum += root.data;
		sum(root.left);
		sum(root.right);
		return sum;
	}
	
	public static void main(String[] args) {
		/*
		 Given a binary tree, find and return the sum of all nodes. 
		 
		 Input format : 
		 Elements in level order form (separated by space). If any node does not have left or right child, 
		 take -1 in its place. 
		 
		 Sample Input : 
		 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1 
		 
		 Sample Output : 
		 35
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		System.out.printf("Sum of all the nodes of the given binary tree is %d%n", sum(root));
	}

}
