package recursion;

import java.util.Scanner;

public class FindFirstIndexOfNumberInArray {
	
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
	
	private static int findIndexOfFirstOccurrence(int[] input, int x, int startIndex) {
		if (startIndex >= input.length - 1) {
			return -1;
		}
		if (input[startIndex] == x) {
			return startIndex;
		}
		return findIndexOfFirstOccurrence(input, x, startIndex + 1);
	}
	
	public static int findIndexOfFirstOccurrence(int[] input, int x) {
		return findIndexOfFirstOccurrence(input, x, 0);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. 
		 Return -1 if it is not present in the array. 
		 
		 First index means, the index of first occurrence of x in the input array. 
		 
		 Do this recursively. Indexing in the array starts from 0. 
		 
		 Input Format : 
		 Line 1 : An Integer N i.e. size of array 
		 Line 2 : N integers which are elements of the array, separated by spaces 
		 Line 3 : Integer x 
		 
		 Output Format : 
		 first index or -1 
		 
		 Constraints : 
		 1 <= N <= 10^3 
		 
		 Sample Input : 
		 4 
		 9 8 10 8 
		 8 
		 
		 Sample Output : 
		 1
		 
		 */
		
		int[] input = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer x to find the index of first occurrence of x in the array: ");
		int x = scanner.nextInt();
		System.out.printf("The index of first occurrence of %d in the array is %d", x, findIndexOfFirstOccurrence(input, x));
	}

}
