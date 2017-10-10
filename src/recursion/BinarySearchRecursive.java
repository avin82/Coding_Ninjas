package recursion;

import java.util.Scanner;

public class BinarySearchRecursive {
	
	public static int index = 0;
	
	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter the elements of the array separated by space or return: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static int binarySearchRecursive(int[] input, int element) {
		return binarySearchRecursive(input, element, 0, input.length - 1);
	}
	
	public static int binarySearchRecursive(int[] input, int x, int start, int end) {
		if (start > end || start == end) {
			return -1;
		}
		int middle = findmiddle(start, end);
		if (input[middle] != x) {
			if (x < input[middle]) {
				index = binarySearchRecursive(input, x, start, middle - 1);
			} else {
				index = binarySearchRecursive(input, x, middle + 1, end);
			}
		} else {
			index = middle;
		}
		return index;
	}
	
	public static int findmiddle(int start, int end) {
		return (start + end) / 2;
	}
	
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. 
		 Return the index of x. 
		 
		 Return -1 if x is not present in the given array. 
		 
		 Input format : 
		 Line 1 : Array size 
		 Line 2 : Array elements (separated by space) 
		 Line 3 : x (element to be searched) 
		 
		 Sample Input : 
		 6 
		 2 3 4 5 6 8 
		 5 
		 
		 Sample Output: 
		 3
		 
		 */
		
		int[] arr = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number x to be searched in the given input array using binary search recursively: ");
		int x = scanner.nextInt();
		System.out.printf("The index of the searched element x i.e. %d in the given array using binary search recursively is: %d", x, binarySearchRecursive(arr, x));
	}

}
