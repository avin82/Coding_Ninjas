package binary_search_trees;

import java.util.Scanner;

import binary_trees.BinaryTreeNode;
import stacks_and_queues.QueueEmptyException;
import stacks_and_queues.QueueUsingLL;

public class ConstructBSTFromSortedArray {
	
	public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr) {
		return sortedArrayToBST(arr, 0, arr.length);
	}
	
	public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			 return null;
		}
		int middle;
		if ((startIndex + endIndex) % 2 == 0) {
			middle = ((startIndex + endIndex) / 2) - 1;
		} else {
		    middle = (startIndex + endIndex) / 2;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[middle]);
		root.left = sortedArrayToBST(arr, startIndex, middle);
		root.right = sortedArrayToBST(arr, middle + 1, endIndex);
		return root;
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void main(String[] args) {
		/*
		 Given a sorted integer array A of size n which contains all unique elements. You need to construct 
		 a balanced BST from this input array. Return the root of constructed BST. 
		 
		 Note : If array size is even, take first mid as root. 
		 
		 Input format : 
		 Line 1 : Integer n (Size of array) 
		 Line 2 : Array elements (separated by space) 
		 
		 Output Format : 
		 BST elements (in pre order traversal, separated by space) 
		 
		 Sample Input : 
		 7 
		 1 2 3 4 5 6 7 
		 
		 Sample Output : 
		 4 2 1 3 6 5 7
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter array element: ");
			arr[i] = scanner.nextInt();
		}
		BinaryTreeNode<Integer> root = sortedArrayToBST(arr);
		preOrder(root);
	}
}
