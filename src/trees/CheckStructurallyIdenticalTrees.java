package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class CheckStructurallyIdenticalTrees {
	
	public static boolean isIdentical = true;
	
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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		if (root1.data != root2.data || root1.children.size() != root2.children.size()) {
			return false;
		} 
		QueueUsingLL<TreeNode<Integer>> pendingNodes1 = new QueueUsingLL<>();
		for (int i = 0; i < root1.children.size(); i++) {
			pendingNodes1.enqueue(root1.children.get(i));
		}
		QueueUsingLL<TreeNode<Integer>> pendingNodes2 = new QueueUsingLL<>();
		for (int i = 0; i < root2.children.size(); i++) {
			pendingNodes2.enqueue(root2.children.get(i));
		}
		if (!pendingNodes1.isEmpty() && !pendingNodes2.isEmpty()) {
			try {
				isIdentical = checkIdentical(pendingNodes1.front(), pendingNodes2.front());
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
		}
		return isIdentical;
	}
	
	public static void main(String[] args) {
		/*
		 Given two Generic trees, return true if they are structurally identical i.e. they are 
		 made of nodes with the same values arranged in the same way. 
		 
		 Input format : 
		 Line 1 : Tree 1 elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 Line 2 : Tree 2 elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 Output format : true or false 
		 
		 Sample Input 1 : 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 1 : 
		 true 
		 
		 Sample Input 2 : 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 10 3 2 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 2: 
		 false
		 */
		TreeNode<Integer> root1 = takeInputLevelWise();
		TreeNode<Integer> root2 = takeInputLevelWise();
		System.out.println(checkIdentical(root1, root2));
	}

}
