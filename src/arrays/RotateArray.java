package arrays;

import java.util.Scanner;

public class RotateArray {
	
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
	
	public static void rotateArray(int[] arr, int d) {
		for (int x = 0; x < d; x++) {
			int j = 0;
			int temp = arr[0];
			while (j < arr.length - 1) {
				arr[j] = arr[j + 1];
				j++;
			} 
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a random integer array of size n, write a function that rotates the given array 
		 by d elements (towards left).
		 
		 Change in the input array itself. You don't need to return or print elements.
		 
		 Input format:
		 Line 1 : Integer n (Array Size) 
		 Line 2 : Array elements (separated by space) 
		 Line 3 : Integer d
		 
		 Output format:
		 Updated array elements (separated by space)
		 
		 Constraints:
		 1 <=N <= 1000
		 1 <=d <= N
		 
		 Sample Input:
		 7
		 1 2 3 4 5 6 7
		 2
		 
		 Sample Output:
		 3 4 5 6 7 1 2
		 
		 */
		
		int[] arr = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number d to rotate the array to the left by that much number: ");
		int d = scanner.nextInt();
		rotateArray(arr, d);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}

}
