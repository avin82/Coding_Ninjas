package binary_trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class LevelOrderTraversalBinaryTree {
	
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
			int counter = pendingNodes.size();
			for (int i = 0; i < counter; i++) {
				try {
					frontNode = pendingNodes.dequeue();
				} catch (QueueEmptyException e) {
					e.printStackTrace();
				}
				System.out.print(frontNode.data + " ");
				if (frontNode.left != null) {
					pendingNodes.enqueue(frontNode.left);
				}
				if (frontNode.right != null) {
					pendingNodes.enqueue(frontNode.right);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a binary tree, print the level order traversal. Make sure each level start in new line. 
		 
		 Input format : 
		 Elements in level order form (separated by space). If any node does not have left or right child, 
		 take -1 in its place. 
		 Output Format : 
		 Elements are printed level wise, each level in new line (separated by space). 
		 
		 Sample Input : 
		 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1 
		 
		 Sample Output : 
		 5 
		 6 10 
		 2 3 
		 9
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
	}

}
