package binary_search_trees;

import java.util.Scanner;

import binary_trees.BinaryTreeNode;
import binary_trees.Pair;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class CheckIfBinaryTreeIsBST {
	
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
	
	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		//	Time complexity is nlogn
		if (root == null) {
			return true;
		}
		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);
		if (root.data <= leftMax) {
			return false;
		}
		if (root.data > rightMin) {
			return false;
		}
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		if (isLeftBST && isRightBST) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root) {
		//	Improved time complexity which is O(n)
		if (root == null) {
			Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
			output.first = true;
			output.second = new Pair<Integer, Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBST2(root.left);
		Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBST2(root.right);
		int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
		int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
		boolean isBST = (root.data > leftOutput.second.second)
				&& (root.data <= rightOutput.second.first)
				&& (leftOutput.first && rightOutput.first);
		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
		output.first = isBST;
		output.second = new Pair<Integer, Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;
	}
	
	public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
		//	Time complexity again is O(n)
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		boolean isLeftBST = isBST3(root.left, min, root.data -1);
		boolean isRightBST = isBST3(root.right, root.data, max);
		return isLeftBST && isRightBST;
	}
	
	public static void main(String[] args) {
		/*
		 Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree) or not. 
		 If yes, return true, return false otherwise. 
		 
		 Duplicate elements should be in right subtree. 
		 
		 Input format : 
		 Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, 
		 take -1 in its place 
		 
		 Output format : 
		 true or false 
		 
		 Constraints : 
		 1 <= N <= 10^5 
		 
		 Sample Input 1 : 
		 3 1 5 -1 2 -1 -1 -1 -1 
		 
		 Sample Output 1 : 
		 true 
		 
		 Sample Input 2 : 
		 5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1 
		 
		 Sample Output 2 : 
		 false
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		System.out.println(isBST2(root).first);
	}
}
