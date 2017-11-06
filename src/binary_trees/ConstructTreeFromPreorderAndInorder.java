package binary_trees;

import java.util.Scanner;

import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class ConstructTreeFromPreorderAndInorder {
	
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in) {
		return getTreeFromPreorderAndInorder(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in, int startIndexPre, 
			int endIndexPre, int startIndexIn, int endIndexIn) {
		if (startIndexPre > endIndexPre || startIndexIn > endIndexIn) {
			return null;
		}
		int temp = pre[startIndexPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(temp);
		
		// Find parent element from inorder
		int i = 0;
		for (int j = 0; j < in.length; j++) {
			if (temp == in[j]) {
				i = j;
				break;
			}
		}
		root.left = getTreeFromPreorderAndInorder(pre, in, startIndexPre + 1, startIndexPre + (i - startIndexIn), startIndexIn, i - 1);
		root.right = getTreeFromPreorderAndInorder(pre, in, startIndexPre + (i - startIndexIn) + 1, endIndexPre, i + 1, endIndexIn);
		return root;
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
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
				System.out.print(frontNode.data + " ");
				if (frontNode.left != null) {
					pendingNodes.enqueue(frontNode.left);
				}
				if (frontNode.right != null) {
					pendingNodes.enqueue(frontNode.right);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given Preorder and Inorder traversal of a binary tree, create the binary tree 
		 associated with the traversals.You just need to construct the tree and return the root. 
		 
		 Note: Assume binary tree contains only unique elements. 
		 
		 Input format : 
		 Line 1 : n (Total number of nodes in binary tree) 
		 Line 2 : Pre order traversal 
		 Line 3 : Inorder Traversal 
		 Output Format : 
		 Elements are printed level wise, each level in new line (separated by space). 
		 
		 Sample Input : 
		 12 
		 1 2 3 4 15 5 6 7 8 10 9 12 
		 4 15 3 2 5 1 6 10 8 7 9 12 
		 
		 Sample Output : 
		 1 
		 2 6 
		 3 5 7 
		 4 8 9 
		 15 10 12
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print	("Enter total number of nodes in the binary tree: ");
		int n = scanner.nextInt();
		int[] preorderArray = new int[n];
		for (int i = 0; i < preorderArray.length; i++) {
			System.out.print("Enter preorder element: ");
			preorderArray[i] = scanner.nextInt();
		}
		System.out.println();
		int[] inorderArray = new int[n];
		for (int i = 0; i < inorderArray.length; i++) {
			System.out.print("Enter inorder element: ");
			inorderArray[i] = scanner.nextInt();
		}
		System.out.println();
		BinaryTreeNode<Integer> root = getTreeFromPreorderAndInorder(preorderArray, inorderArray);
		printLevelWise(root);
	}
}
