package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class NextLargerElementInTheTree {
	
	public static TreeNode<Integer> ans;
	public static TreeNode<Integer> temp = null;
	public static QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
	
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
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {
		if (ans == null) {
			if (root.data > n) {
				ans = root;
			}
		} else {
			if (root.data < ans.data && root.data > n) {
				ans = root;
			}
		}
		for (int i = 0; i < root.children.size(); i++) {
			pendingNodes.enqueue(root.children.get(i));
			try {
				temp = findNextLargerNode(pendingNodes.dequeue(), n);
				if (temp.data > n) {
					if (temp.data < ans.data) {
						ans = temp;
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		/*
		 Given a generic tree and an integer n. Find and return the node with next larger element 
		 in the Tree i.e. find a node with value just greater than n. 
		 
		 Return NULL if no node is present with value greater than n. 
		 
		 Input format : 
		 Line 1 : Integer n 
		 Line 2 : Elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 Output format : Node with value just greater than n. 
		 
		 Sample Input 1 : 
		 18 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 1 : 
		 20 
		 
		 Sample Input 2 : 
		 21 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output 2: 
		 30
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer n to find the node with the next larger element in the tree: ");
		int n = scanner.nextInt();
		TreeNode<Integer> root = takeInputLevelWise();
		System.out.println(findNextLargerNode(root, n).data);
	}

}
