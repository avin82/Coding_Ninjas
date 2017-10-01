package recursion;

import java.util.Scanner;

public class SumOfArray {
	
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
	
	public static int sumOfArrayRecursively(int[] input) {
		if (input.length == 1) {
			return input[0];
		}
		int[] smallerArr = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallerArr[i - 1] = input[i];
		}
		return input[0] + sumOfArrayRecursively(smallerArr);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an array of length N, you need to find and return the sum of all elements of the array. 
		 
		 Do this recursively. 
		 
		 Input Format : 
		 Line 1 : An Integer N i.e. size of array 
		 Line 2 : N integers which are elements of the array, separated by spaces 
		 
		 Output Format : 
		 Sum 
		 
		 Constraints : 
		 1 <= N <= 10^3 
		 
		 Sample Input : 
		 3 
		 9 8 9 
		 
		 Sample Output : 
		 26
		 
		 */
		
		int[] input = takeInput();
		System.out.printf("Sum of all elements of the array is %d", sumOfArrayRecursively(input));
	}

}
