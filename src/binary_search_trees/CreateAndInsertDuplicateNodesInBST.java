package binary_search_trees;

import java.util.Scanner;

import binary_trees.BinaryTreeNode;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class CreateAndInsertDuplicateNodesInBST {
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner scanner = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data: ");
		int rootData = scanner.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = null;
			try {
				frontNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + frontNode.data + ": ");
			int leftCild = scanner.nextInt();
			if (leftCild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftCild);
				pendingNodes.enqueue(child);
				frontNode.left = child;
			}
			System.out.println("Enter right child of " + frontNode.data + ": ");
			int rightChild = scanner.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				frontNode.right = child;
			}
		}
		return root;
	}
	
	public static void printLevelOrderTraversal(BinaryTreeNode<Integer> root) {
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
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
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
				BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(frontNode.data);
				if (frontNode.left != null) {
					pendingNodes.enqueue(frontNode.left);
				}
				if (frontNode.right != null) {
					pendingNodes.enqueue(frontNode.right);
				}
				if (frontNode.left == null) {
					frontNode.left = newNode;
				} else {
					BinaryTreeNode<Integer> temp = frontNode.left;
					frontNode.left = newNode;
					newNode.left = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given a BST with N number of nodes, for each node create a new duplicate node, 
		 and insert that duplicate as left child of the original node. 
		 
		 Note : Root will remain same. So you just need to insert nodes in the given BST 
		 and no need to print or return anything. 
		 
		 Input format : 
		 Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 
		 Output Format : 
		 Level order traversal of updated tree. (Every level in new line) 
		 
		 Constraints : 
		 1 <= N <= 1000 
		 
		 Sample Input : 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 
		 
		 Sample Output : 
		 8 
		 8 10 
		 5 10 
		 5 6 
		 2 6 7 
		 2 7
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		insertDuplicateNode(root);
		printLevelOrderTraversal(root);
	}
}
