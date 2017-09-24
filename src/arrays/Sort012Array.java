package arrays;

import java.util.Scanner;

public class Sort012Array {
	
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
	
	public static void sort012ElementArray(int[] arr) {
		int countOfZeroes = 0, countOfOnes = 0, countOfTwos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countOfZeroes++;
			} else if (arr[i] == 1) {
				countOfOnes++;
			} else if (arr[i] == 2) {
				countOfTwos++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < countOfZeroes) {
				arr[i] = 0;
			} else if (i < countOfZeroes + countOfOnes) {
				arr[i] = 1;
			} else if (i < countOfZeroes + countOfOnes + countOfTwos) {
				arr[i] = 2;
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 You are given an integer array containing only 0s, 1s and 2s. Write a solution to sort this array using one scan only. 
		 You need to change in the given array itself. So no need to return or print anything.
		 
		 Input format:
		 Line 1 : Integer n (Array Size) 
		 Line 2 : Array elements (separated by space)
		 
		 Output format:
		 Updated array elements (separated by space)
		 
		 Constraints:
		 1 <= n <= 10^6
		 
		 Sample Input:
		 7
		 0 1 2 0 2 0 1
		 
		 Sample Output:
		 
		 0 0 0 1 1 2 2
		 
		 */
		
		int[] arr = takeInput();
		sort012ElementArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
