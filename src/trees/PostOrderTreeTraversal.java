package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class PostOrderTreeTraversal {
	
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
	
	public static void postOrderTraversal(TreeNode<Integer> root) {
		if (root == null) {
			return;
		} else if (root.children.size() == 0) {
			System.out.print(root.data + " ");
		}
		int counter = 0;
		for (int i = 0; i < root.children.size(); i++) {
			counter++;
			postOrderTraversal(root.children.get(i));
			if (counter == root.children.size()) {
				System.out.print(root.data + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a generic tree, print the post-order traversal of given tree. 
		 
		 Post-order traversal is : Children and then Root 
		 
		 Input format : 
		 Elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 
		 Output Format : 
		 Post-order traversal, elements separated by space 
		 
		 Sample Input : 
		 10 3 20 30 40 2 400 50 0 0 0 0 
		 
		 Sample Output : 
		 400 50 20 30 40 10
		 */
		TreeNode<Integer> root = takeInputLevelWise();
		postOrderTraversal(root);
	}

}
