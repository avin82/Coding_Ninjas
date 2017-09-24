package arrays;

import java.util.Scanner;

public class ReturnArraySum {
	
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
	
	public static int sumOfArrayElements(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		/*
		 Return Array Sum
		 
		 Given an array of length N, you need to find and return the sum of all elements of the array.
		 
		 Input Format:
		 Line 1: An Integer N i.e. size of array
		 Line 2: N integers which are elements of the array, separated by spaces
		 
		 Output Format:
		 Sum
		 
		 Constraints:
		 1 <= N <= 10^6
		 
		 Sample Input:
		 3
		 9 8 9
		 
		 Sample Output:
		 26
		 
		 */
		
		int[] arr = takeInput();
		System.out.printf("Sum of all elements of the array is %d", sumOfArrayElements(arr));
	}

}
