package recursion;

import java.util.Scanner;

public class FindAllIndexesOfNumberInArray {
	public static int tempNextIndex = 0;
	public static int[] arrayOfIndexes;
	
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
	
	private static int[] findIndexesOfAllOccurrences(int[] input, int x, int startIndex) {
		int[] tempArray;
		if (input[startIndex] == x) {
			arrayOfIndexes[tempNextIndex] = startIndex;
			tempNextIndex++;
		}
		if (startIndex < input.length - 1) {
			tempArray = findIndexesOfAllOccurrences(input, x, startIndex + 1);
			for (int i = 0; i < tempArray.length; i++) {
				arrayOfIndexes[tempNextIndex] = tempArray[i];
			}
		}
		int size = 0;
		for (int i = 0; i < arrayOfIndexes.length; i++) {
			if (i == 0) {
				continue;
			}
			if (arrayOfIndexes[i] != 0) {
				size++;
			}
		}
		int[] finalArray = new int[size];
		for (int i = 0; i < finalArray.length; i++) {
			finalArray[i] = arrayOfIndexes[i];
			
		}
		return finalArray;
	}
	
	public static int[] findIndexesOfAllOccurrences(int[] input, int x) {
		arrayOfIndexes = new int[input.length];
		return findIndexesOfAllOccurrences(input, x, 0);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. 
		 Save all the indexes in an array (in increasing order). 
		 
		 Do this recursively. Indexing in the array starts from 0. 
		 
		 Input Format : 
		 Line 1 : An Integer N i.e. size of array 
		 Line 2 : N integers which are elements of the array, separated by spaces 
		 Line 3 : Integer x Output Format : indexes where x is present in the array (separated by space) 
		 
		 Constraints : 
		 1 <= N <= 10^3 
		 
		 Sample Input : 
		 5 
		 9 8 10 8 8 
		 8 
		 
		 Sample Output : 
		 1 3 4
		 
		 */
		
		int[] input = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer x to find all the indexes of occurrences of x in the array: ");
		int x = scanner.nextInt();
		int[] arr = findIndexesOfAllOccurrences(input, x);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
	}

}
