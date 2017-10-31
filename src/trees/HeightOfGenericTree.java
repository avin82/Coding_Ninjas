package trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class HeightOfGenericTree {
	
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
	
	public static int height(TreeNode<Integer> root) {
		if (root.children.size() == 0) {
			return 1;
		} 
		int levelCount = 0;
		for (int i = 0; i < root.children.size(); i++) {
			levelCount = Math.max(levelCount, height(root.children.get(i)));
		}
		return levelCount + 1;
	}
	
	public static void main(String[] args) {
		/*
		 Given a generic tree, find and return the height of given tree. 
		 
		 Input format : Elements in level order form separated by space (as per done in class). Order is - 
		 Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
		 
		 Output Format : 
		 Height 
		 
		 Sample Input : 
		 10 3 20 30 40 2 40 50 0 0 0 0 
		 
		 Sample Output : 
		 3
		 */
		TreeNode<Integer> root = takeInputLevelWise();
		System.out.printf("Height of the tree is %d", height(root));
	}

}
