package maps;

import java.util.Scanner;

public class PairsWithDifferenceKProgram2 {
	
	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Please enter the elements of the array separated by space or return: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static void findPairsDifferenceK(int[] input, int k) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (Math.abs(input[i] - input[j]) == k) {
					if (input[i] < input[j]) {
						System.out.println(input[i] + " " + input[j]);
					} else {
						System.out.println(input[j] + " " + input[i]);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 You are given with an array of integers and an integer K. Write a program to find 
		 and print all pairs which have difference K. 
		 
		 Best solution takes O(n) time. And take difference as absolute. 
		 
		 Input Format : 
		 Line 1 : Integer n, Size of array 
		 Line 2 : Array elements (separated by space) 
		 Line 3 : K 
		 
		 Output format : 
		 Print pairs in different lines (pair elements separated by space). In a pair, smaller element 
		 should be printed first. (Order of different pairs is not important) 
		 
		 Constraints : 
		 1 <= n <= 5000 
		 
		 Sample Input 1 : 
		 4 
		 5 1 2 4 
		 3 
		 
		 Sample Output 1 : 
		 2 5 
		 1 4 
		 
		 Sample Input 2 : 
		 4 
		 4 4 4 4 
		 0 
		 
		 Sample Output 2 : 
		 4 4 
		 4 4 
		 4 4 
		 4 4 
		 4 4 
		 4 4
		 */
		int[] arr = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer k to find and print all the pairs from "
				+ "given array having difference equal to k: ");
		int k = scanner.nextInt();
		findPairsDifferenceK(arr, k);
	}

}
