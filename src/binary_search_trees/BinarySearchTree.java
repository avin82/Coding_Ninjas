package binary_search_trees;

import binary_trees.BinaryTreeNode;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class BinarySearchTree {
	
	private static BinaryTreeNode<Integer> root;
	
	private static BinaryTreeNode<Integer> insertData(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if (root.data > data) {
			root.left = insertData(data, root.left);
		} else if (root.data < data) {
			root.right = insertData(data, root.right);
		} 
		return root;
	}
	
	public static void insertData(int data) {
		root = insertData(data, root);
	}
	
	private boolean searchHelper(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		} else if (data > root.data) {
			return searchHelper(data, root.right);
		} else {
			return searchHelper(data, root.left);
		}
	}
	
	public boolean search(int data) {
		return searchHelper(data, root);
	}
	
	public void deleteData(int data) {
		root = deleteData(data, root);
	}
	
	private BinaryTreeNode<Integer> deleteData(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (data < root.data) {
			root.left = deleteData(data, root.left);
			return root;
		} else if (data > root.data) {
			root.right = deleteData(data, root.right);
			return root;
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				BinaryTreeNode<Integer> minNode = root.right;
				while (minNode.left != null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteData(minNode.data, root.right);
				return root;
			}
		}
	}
	
	private static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + ":";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		if (root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
	public void printTree() {
		printTree(root);
	}
	
	public static void main(String[] args) {
		/*
		 Implement the BST class which includes following functions - 
		 
		 1. search 
		 
		 Given an element, find if that is present in BSt or not. Return true or false. 
		 
		 2. insert - 
		 
		 Given an element, insert that element in the BST at the correct position. Assume unique elements 
		 will be given. 
		 
		 3. delete - 
		 
		 Given an element, remove that element from the BST. If the element which is to be deleted has 
		 both children, replace that with the minimum element from right sub-tree. 
		 
		 4. printTree (recursive) - 
		 
		 Print the BST in ithe following format - 
		 
		 For printing a node with data N, you need to follow the exact format - 
		 
		 N:L:x,R:y 
		 
		 where, N is data of any node present in the binary tree. x and y are the values of left and 
		 right child of node N. Print the children only if it is not null. 
		 
		 There is no space in between. 
		 
		 You need to print all nodes in the recursive format in different lines.
		 */
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(20);
		bst.insertData(40);
		bst.insertData(10);
		bst.insertData(30);
		bst.insertData(70);
		bst.insertData(15);
		bst.insertData(65);
		bst.insertData(35);
		bst.insertData(25);
		System.out.println(bst.search(40));
		bst.deleteData(40);
		System.out.println(bst.search(40));
		System.out.println(bst.search(65));
		bst.printTree();
	}
}
