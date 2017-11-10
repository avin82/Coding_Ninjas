package binary_trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;
import stacks_and_queues.StackEmptyException;
import stacks_and_queues.StackUsingLL;

public class PrintBinaryTreeInZigZagFashion {
	
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
	
	public static void printZigZag(BinaryTreeNode<Integer> root) {
		StackUsingLL<BinaryTreeNode<Integer>> pendingNodesFromStack1 = new StackUsingLL<>();
		StackUsingLL<BinaryTreeNode<Integer>> pendingNodesFromStack2 = new StackUsingLL<>();
		pendingNodesFromStack1.push(root);
		while (!pendingNodesFromStack1.isEmpty() || !pendingNodesFromStack2.isEmpty()) {
			BinaryTreeNode<Integer> lastNode1 = null;
			int counterForStack1 = pendingNodesFromStack1.size();
			for (int i = 0; i < counterForStack1; i++) {
				try {
					lastNode1 = pendingNodesFromStack1.pop();
				} catch (StackEmptyException e) {
					e.printStackTrace();
				}
				System.out.print(lastNode1.data + " ");
				if (lastNode1.left != null) {
					pendingNodesFromStack2.push(lastNode1.left);
				}
				if (lastNode1.right != null) {
					pendingNodesFromStack2.push(lastNode1.right);
				}
			}
			System.out.println();
			BinaryTreeNode<Integer> lastNode2 = null;
			int counterForStack2 = pendingNodesFromStack2.size();
			for (int i = 0; i < counterForStack2; i++) {
				try {
					lastNode2 = pendingNodesFromStack2.pop();
				} catch (StackEmptyException e) {
					e.printStackTrace();
				}
				System.out.print(lastNode2.data + " ");
				if (lastNode2.right != null) {
					pendingNodesFromStack1.push(lastNode2.right);
				}
				if (lastNode2.left != null) {
					pendingNodesFromStack1.push(lastNode2.left);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a binary tree, print the zig zag order i.e print level 1 from left to right, 
		 level 2 from right to left and so on. This means odd levels should get printed from 
		 left to right and even level right to left. 
		 
		 Input format : 
		 Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 Output Format : 
		 Elements are printed level wise, each level in new line (separated by space). 
		 
		 Sample Input : 
		 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1 
		 
		 Sample Output : 
		 5 
		 10 6 
		 2 3 
		 9
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printZigZag(root);
	}
}
