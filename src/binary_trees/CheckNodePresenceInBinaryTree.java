package binary_trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class CheckNodePresenceInBinaryTree {
	
	public static boolean isPresent = false;
	
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
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x) {
		if (root == null) {
			return false;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = null;
			try {
				frontNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
			if (frontNode.data == x) {
				isPresent = true;
				break;
			}
			isPresent = isNodePresent(root.left, x) || isNodePresent(root.right, x);
		}
		return isPresent;
	}
	
	public static void main(String[] args) {
		/*
		 Given a Binary Tree and an integer x, check if node with data x is present in the input binary tree or not. 
		 Return true or false. 
		 
		 Input format : 
		 Line 1 : Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 Line 2 : Integer x 
		 
		 Output Format : 
		 true or false 
		 
		 Sample Input : 
		 8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1 
		 7 
		 
		 Sample Output : 
		 true
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer x to check its presence in the given binary tree: ");
		int x = scanner.nextInt();
		System.out.println(isNodePresent(root, x));
	}

}
