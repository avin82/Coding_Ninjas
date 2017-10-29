package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class PrintTreeLevelWise {
	
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
	
	public static int numNodes(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count += numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static int largest(TreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int ans = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			int largestChild = largest(root.children.get(i));
			if (largestChild > ans) {
				ans = largestChild;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		/*
		 Given a generic tree, print the input tree in level wise order. That is, 
		 print the elements at same level in one line (separated by space). 
		 Print different levels in different lines. 
		 
		 Input format : 
		 Elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 
		 Output Format : Level wise print 
		 
		 Sample Input : 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output : 
		 10 
		 20 30 40 
		 40 50
		 */
		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
		System.out.printf("There are %d nodes in the tree.%n", numNodes(root));
		System.out.printf("%d is the largest node in the tree.", largest(root));
	}

}
