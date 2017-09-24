package arrays;

import java.util.Scanner;

public class CheckArrayRotation {
	
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
	
	public static int arrayRotationByNumber(int[] arr) {
		int i;
		boolean rotationCheck = false;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				rotationCheck = true;
				break;
			}
		}
		if (rotationCheck) {
			return i + 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 Given an integer array, which is sorted (in increasing order) and has been rotated by some number k in clockwise direction. 
		 Find and return the k.
		 
		 Input format:
		 Line 1 : Integer n (Array Size) 
		 Line 2 : Array elements (separated by space)
		 
		 Output format:
		 Integer k
		 
		 Constraints: 
		 1 <= n <= 1000
		 
		 Sample Input 1:
		 6
		 5 6 1 2 3 4
		 
		 Sample Output 1:
		 2
		 
		 Sample Input 2:
		 5
		 3 6 8 9 10
		 
		 Sample Output 2:
		 0
		 
		 */
		
		int[] arr = takeInput();
		System.out.printf("The given array has been rotated by number %d in clockwise direction.", arrayRotationByNumber(arr));
	}

}
