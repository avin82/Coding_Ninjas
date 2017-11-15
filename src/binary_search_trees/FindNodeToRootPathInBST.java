package binary_search_trees;

import java.util.ArrayList;
import java.util.Scanner;

import binary_trees.BinaryTreeNode;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class FindNodeToRootPathInBST {
	
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
	
	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data) {
		if (root == null) {
			return null;
		}
		if (root.data == data) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		if (root.data > data) {
			ArrayList<Integer> leftOutput = findPath(root.left, data);
			if (leftOutput != null) {
				leftOutput.add(root.data);
				return leftOutput;
			} else {
				return null;
			}
		} else {
			ArrayList<Integer> rightOutput = findPath(root.right, data);
			if (rightOutput != null) {
				rightOutput.add(root.data);
				return rightOutput;
			} else {
				return null;
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a BST and an integer k. Find and return the path from the node with data k 
		 and root (if a node with data k is present in given BST). Return null otherwise.
		 
		 Assume that BST contains all unique elements.
		 
		 Input Format : 
		 Line 1 : Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 Line 2 : 
		 Integer k 
		 
		 Output Format : 
		 Path from node k to root
		 
		 Sample Input: 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
		 2
		 
		 Sample Output:
		 2
		 5
		 8
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the data of the node for which root to node path is required: ");
		int k = scanner.nextInt();
		ArrayList<Integer> list = findPath(root, k);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
