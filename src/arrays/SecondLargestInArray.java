package arrays;

import java.util.Scanner;

public class SecondLargestInArray {
	
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
	
	public static int secondLargestElementInArray(int[] arr) {
		if (arr.length <= 1) {
			return -(int)Math.pow(2, 31);
		} else {
			int max = Integer.MIN_VALUE;
			int i;
			for (i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			int difference = 0;
			int minDifference = Integer.MAX_VALUE;
			int j;
			for (j = 0; j < arr.length; j++) {
				if (arr[j] != max) {
					difference = max - arr[j];
					if (difference < minDifference) {
						minDifference = difference;
					}
				}
			}
			return (max - minDifference);
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a random integer array of size n, find and return the second largest element present in the array. 
		 If n <= 1, return -2^31.
		 
		 Input format:
		 Line 1 : Integer n (Array Size) 
		 Line 2 : Array elements (separated by space)
		 
		 Output format:
		 Second largest element
		 
		 Constraints:
		 1 <= N <= 10^6
		 
		 Sample Input 1:
		 7
		 2 13 4 1 3 6 28
		 
		 Sample Output 1:
		 13
		 
		 Sample Input 2:
		 5
		 9 3 6 2 0
		 
		 Sample Output 2:
		 6
		 
		 */
		
		int[] arr = takeInput();
		System.out.printf("The second largest element in the array is %d%n", secondLargestElementInArray(arr));
	}

}
