package arrays;

import java.util.Scanner;

public class FindDuplicateInArray {
	
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
	
	public static int findDuplicateInArray(int arr[]) {
		
		int i = 0, j = 1;
		String arrayElementAsDuplicateString = "";
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arrayElementAsDuplicateString += arr[i];
					break;
				}
			}
			if (arrayElementAsDuplicateString.length() > 0) {
				break;
			}
		}
		return arr[i];
	}
	
	public static void main(String[] args) {
		
		/*
		 Given an array of integers of size n which contains numbers from 0 to n - 2. 
		 Each number is present at least once. That is, if n = 5, numbers from 0 to 3 
		 is present in the given array at least once and one number is present twice. 
		 You need to find and return that duplicate number present in the array. 
		 Assume, duplicate number is always present in the array.
		 
		 Input Format:
		 Line 1 : Size of input array 
		 Line 2 : Array elements (separated by space)
		 
		 Output Format:
		 Duplicate element
		 
		 Constraints:
		 1<=n<=10^3
		 
		 Sample Input:
		 9
		 0 7 2 5 4 7 1 3 6
		 
		 Sample Output:
		 7
		 
		 */
		
		int[] arr = takeInput();
		System.out.printf("The duplicate element in the array is %d", findDuplicateInArray(arr));
	}

}
