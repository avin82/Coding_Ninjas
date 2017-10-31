package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class NodeWithMaxNodeChildrenSum {
	
	public static TreeNode<Integer> ans;
	public static int maxSum = 0;
	
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
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
		if (root.children.size() == 0) {
			return root;
		}
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			sum += root.children.get(i).data;
		}
		if (sum > maxSum) {
			maxSum = sum;
			ans = root;
		}
		for (int i = 0; i < root.children.size(); i++) {
			if (maxSumNode(root.children.get(i)).data > maxSum) {
				maxSum = maxSumNode(root.children.get(i)).data;
				ans = root.children.get(i);
			} 
		}
		return ans;
	}
	
	public static void main(String[] args) {
		/*
		 Given a tree, find and return the node for which sum of data of all children and the node itself 
		 is maximum. In the sum, data of node itself and data of immediate children is to be taken. 
		 
		 Input format : 
		 Line 1 : Elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 Output format : Node with maximum sum. 
		 
		 Sample Input 1 : 
		 5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0 
		 
		 Sample Output 1 : 
		 1
		 */
		TreeNode<Integer> root = takeInputLevelWise();
		System.out.printf("Node for which sum of all children and the node itself is maximum is %d", maxSumNode(root).data);
	}

}
