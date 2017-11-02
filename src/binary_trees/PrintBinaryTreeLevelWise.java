package binary_trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class PrintBinaryTreeLevelWise {
	
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
	
	public static void main(String[] args) {
		/*
		 Given a binary tree, print the tree in level wise order. 
		 For printing a node with data N, you need to follow the exact format - 
		 
		 N:L:x,R:y 
		 
		 where, N is data of any node present in the binary tree. x and y are the values of 
		 left and right child of node N. Print -1. if any child is null. There is no space in between. 
		 You need to print all nodes in the level order form in different lines. 
		 
		 Input format : 
		 Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 
		 Sample Input : 8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1 
		 
		 Sample Output : 
		 8:L:3,R:10 
		 3:L:1,R:6 
		 10:L:-1,R:14 
		 1:L:-1,R:-1 
		 6:L:4,R:7 
		 14:L:13,R:-1 
		 4:L:-1,R:-1 
		 7:L:-1,R:-1 
		 13:L:-1,R:-1
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
	}
}
