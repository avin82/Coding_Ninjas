package binary_trees;

import java.util.Scanner;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class HeightOfBinaryTree {
	
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
	
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 1;
		}
		int levelCount = 0;
		levelCount = Math.max(height(root.left), height(root.right));
		return levelCount + 1;
	}
	
	public static void main(String[] args) {
		/*
		 Given a binary tree, find and return the height of given tree. 
		 
		 Input format : 
		 Nodes in the level order form (separated by space). If any node does not have left or right child, 
		 take -1 in its place 
		 
		 Output format : 
		 Height 
		 
		 Constraints : 
		 1 <= N <= 10^5 
		 
		 Sample Input : 
		 10 9 4 -1 -1 5 8 -1 6 -1 -1 3 -1 -1 -1 
		 
		 Sample Output : 
		 5
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		System.out.println(height(root));
	}

}
