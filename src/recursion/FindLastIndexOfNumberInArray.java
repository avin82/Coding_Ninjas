package recursion;

import java.util.Scanner;

public class FindLastIndexOfNumberInArray {
	public static boolean isFound = false;
	public static int tempLastIndex = 0;
	
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
	
	private static int findLastIndexOfOccurrence(int[] input, int x, int startIndex) {
		if (startIndex >= input.length) {
			if (!isFound) {
				return -1;
			} else {
				return tempLastIndex;
			}
		}
		if (input[startIndex] == x) {
			isFound = true;
			tempLastIndex = startIndex;
		}
		int finalVal = findLastIndexOfOccurrence(input, x, startIndex + 1);
		if (startIndex == input.length - 1) {
			if (isFound) {
				tempLastIndex = finalVal;
			} else {
				tempLastIndex = -1;
			}
		}
		return tempLastIndex;
	}
	
	public static int findLastIndexOfOccurrence(int[] input, int x) {
		return findLastIndexOfOccurrence(input, x, 0);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. 
		 Return -1 if it is not present in the array. 
		 
		 Last index means - if x is present multiple times in the array, return the index at which x comes last in the array. 
		 
		 You should start traversing your array from 0, not from (N - 1). 
		 
		 Do this recursively. Indexing in the array starts from 0. 
		 
		 Input Format : 
		 Line 1 : An Integer N i.e. size of array 
		 Line 2 : N integers which are elements of the array, separated by spaces 
		 Line 3 : Integer x 
		 
		 Output Format : 
		 last index or -1 
		 
		 Constraints : 
		 1 <= N <= 10^3 
		 
		 Sample Input : 
		 4 
		 9 8 10 8 
		 8 
		 
		 Sample Output : 
		 3
		 
		 */
		
		int[] input = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer x to find the last index of occurrence of x in the array: ");
		int x = scanner.nextInt();
		System.out.printf("The last index of occurrence of %d in the array is %d", x, findLastIndexOfOccurrence(input, x));
	}

}
