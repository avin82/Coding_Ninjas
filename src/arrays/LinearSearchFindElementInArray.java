package arrays;

import java.util.Scanner;

public class LinearSearchFindElementInArray {
	
	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the array you want to initialize and print: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter the elements of the array separated by space or return: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static int findElementInArray(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a random integer array A and an element x. You need to search this element x in the given array using linear search. 
		 Return the index of element in the input. 
		 
		 Linear search means, we need to compare elements from the array A one by one with the element x, till we found the match 
		 or we reach the end of array. If match found, return its index, and if not return -1. 
		 
		 Indexing in the array starts from 0.
		 
		 Input format:
		 Line 1 : Integer n, Array Size 
		 Line 2 : Array elements (separated by space) 
		 Line 3 : Element to be searched (i.e. x)
		 
		 Constraints:
		 1 <= n <= 10^5
		 
		 Sample Input 1:
		 7
		 2 13 4 1 3 6 28
		 3
		 
		 Sample Output 1:
		 4
		 
		 Sample Input 2: 
		 7
		 2 13 4 1 3 6 28
		 9
		 
		 Sample Output 2:
		 -1
		 
		 */
		
		int[] arr = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the element of the array you want to search for: ");
		int x = scanner.nextInt();
		System.out.printf("The element %d of the array is located at index %d", x, findElementInArray(arr, x));
	}

}
