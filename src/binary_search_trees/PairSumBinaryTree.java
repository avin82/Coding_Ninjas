package binary_search_trees;

import java.util.ArrayList;
import java.util.Scanner;

import binary_trees.BinaryTreeNode;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class PairSumBinaryTree {
	
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
	
	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		ArrayList<Integer> list = new ArrayList<>();
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
				list.add(frontNode.data);
				if (frontNode.left != null) {
					pendingNodes.enqueue(frontNode.left);
				}
				if (frontNode.right != null) {
					pendingNodes.enqueue(frontNode.right);
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j != i && j < list.size(); j++) {
				if (list.get(i) + list.get(j) == sum) {
					if (list.get(i) < list.get(j)) {
						System.out.println(list.get(i) + " " + list.get(j));
					} else {
						System.out.println(list.get(j) + " " + list.get(i));
					} 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a binary tree and an integer S, print all the pair of nodes whose sum equals S. 
		 
		 Assume binary tree contains all unique elements. 
		 
		 Note : In a pair, print the smaller element first. Order of different pair doesn't matter. 
		 
		 Input format : 
		 Line 1 : Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 Line 2 : Integer S 
		 
		 Output Format : 
		 Each pair in different line (pair elements separated by space) 
		 
		 Constraints : 
		 1 <= N <= 1000 
		 
		 Sample Input 1: 
		 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1 
		 15 
		 
		 Sample Output 1: 
		 5 10 
		 6 9
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer s to find pair of nodes in given binary tree whose sum equals s: ");
		int s = scanner.nextInt();
		nodesSumToS(root, s);
	}

}
