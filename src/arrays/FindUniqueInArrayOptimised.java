package arrays;

import java.util.Scanner;

public class FindUniqueInArrayOptimised {
	
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
	
	public static int findUniqueElementInArray(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[i] == arr[j]) {
						break;
					}
				}
			}
			if (j == arr.length) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	
	public static void main(String[] args) {
		
		/*
		 Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number 
		 is present only once in the array. You need to find and return that number which is unique in the array. 
		 
		 Note : Given array will always contain odd number of elements.
		 
		 Input Format: 
		 Line 1 : Array size i.e. 2N+1 
		 Line 2 : Array elements (separated by space)
		 
		 Output Format:
		 Unique element present in the array
		 
		 Constraints: 1<=N<=10^3
		 
		 Sample Input:
		 7
		 2 3 1 6 3 6 2
		 
		 Sample Output:
		 1
		 
		 */
		
		int[] arr = takeInput();
		System.out.printf("The unique element in the array is %d", findUniqueElementInArray(arr));
	}

}
