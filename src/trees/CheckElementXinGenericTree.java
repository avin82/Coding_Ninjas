package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class CheckElementXinGenericTree {
	
	public static boolean isPresent = false;
	
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
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {
		if (root == null) {
			isPresent = false;
		} else if (root.data  == x) {
			return true;
		}
		for (int i = 0; i < root.children.size(); i++) {
			isPresent = checkIfContainsX(root.children.get(i), x);
		}
		return isPresent;
	}
	
	public static void main(String[] args) {
		/*
		 Given a generic tree and an integer x, check if x is present in the given tree or not. 
		 Return true if x is present, return false otherwise. 
		 
		 Input format : 
		 Line 1 : Integer x 
		 Line 2 : Elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 
		 Output format : true or false 
		 
		 Sample Input 1 : 
		 40 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 1 : 
		 true 
		 
		 Sample Input 2 : 
		 4 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 2: 
		 false
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an element say x which is to be searched for in the generic tree: ");
		int x = scanner.nextInt();
		TreeNode<Integer> root = takeInputLevelWise();
		System.out.println(checkIfContainsX(root, x));
	}

}
