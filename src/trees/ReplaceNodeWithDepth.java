package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class ReplaceNodeWithDepth {
	
	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter root data: ");
		int rootData = scanner.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = null;
			try {
				frontNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
			System.out.println("Enter number of children of " + frontNode.data + ": ");
			int numOfChildren = scanner.nextInt();
			for (int i = 0; i < numOfChildren; i++) {
				System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data + ": ");
				int child = scanner.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}
	
	public static void printLevelWise(TreeNode<Integer> root){
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = null;
			int counter = pendingNodes.size();
			for (int i = 0; i < counter; i++) {
				try {
					frontNode = pendingNodes.dequeue();
				} catch (QueueEmptyException e) {
					e.printStackTrace();
				}
				System.out.print(frontNode.data + " ");
				for (int j = 0; j < frontNode.children.size(); j++) {
					pendingNodes.enqueue(frontNode.children.get(j));
				}
			}
			System.out.println();
		}
	}
	
	public static void replaceWithDepthValue(TreeNode<Integer> root) {
		replaceWithDepthValue(root, 0);
	}
	
	public static void replaceWithDepthValue(TreeNode<Integer> root, int depth) {
		if (depth == 0) {
			root.data = depth;
		} 
		root.data = depth;
		for (int i = 0; i < root.children.size(); i++) {
			replaceWithDepthValue(root.children.get(i), depth + 1);
		}
	}
	
	public static void main(String[] args) {
		/*
		 In a given Generic Tree, replace each node with its depth value. You need to just update the data 
		 of each node, no need to return or print anything. 
		 
		 Input format : 
		 Line 1 : Elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 
		 Sample Input 1 : 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 1 : (Level wise, each level in new line) 	
		 0 
		 1 1 1 
		 2 2
		 */
		TreeNode<Integer> root = takeInputLevelWise();
		replaceWithDepthValue(root);
		printLevelWise(root);
	}

}
