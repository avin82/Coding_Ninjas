package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class NumNodesGreaterThanX {
	
	public static int count = 0;
	
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
	
	public static int numNodeGreater(TreeNode<Integer> root, int x) {
		if (root.data > x) {
			count++;
		} 
		for (int i = 0; i < root.children.size(); i++) {
			numNodeGreater(root.children.get(i), x);
		}
		return count;
	}
	
	public static void main(String[] args) {
		/*
		 Given a tree and an integer x, find and return number of Nodes which are greater than x. 
		 
		 Input format : 
		 Line 1 : Integer x 
		 Line 2 : Elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 
		 Output Format : 
		 Count of nodes greater than x 
		 
		 Sample Input 1 : 
		 35 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 1 : 
		 3 
		 
		 Sample Input 2 : 
		 10 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 2: 
		 5
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number say x to find number of nodes greater than x in a given tree: ");
		int x = scanner.nextInt();
		TreeNode<Integer> root = takeInputLevelWise();
		System.out.printf("%d nodes are greater than %d", numNodeGreater(root, x), x);
	}

}
