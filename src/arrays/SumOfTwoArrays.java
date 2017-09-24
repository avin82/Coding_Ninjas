package arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
	
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
	
	public static int[] sumOf2Arrays(int[] arr1, int[] arr2) {
		int greaterLength = Integer.MIN_VALUE;
		if (arr1.length > arr2.length) {
			greaterLength = arr1.length;
		} else {
			greaterLength = arr2.length;
		}
		int[] arr3 = new int[greaterLength + 1];
		int sum;
		boolean isCarry = false;
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k;
		for (k = arr3.length - 1; i >= 0 && j >= 0 && k >= 0; k--) {
			sum = 0;
			if (isCarry) {
				sum = 1 + arr1[i] + arr2[j];
				} else {
					sum = arr1[i] + arr2[j];
				}
				if (sum <= 9) {
					isCarry = false;
					arr3[k] = sum;
					i--;
					j--;
					continue;
				} else {
					arr3[k] = sum % 10;
					isCarry = true;
					i--;
					j--;
					continue;
				}
		}
		while (k >= 0) {
			sum = 0;
			if (isCarry) {
				if (i < 0 && j >= 0) {
					sum = 1 + arr2[j];
					if (sum <= 9) {
						isCarry = false;
						arr3[k] = sum;
					} else {
						isCarry = true;
						arr3[k] = sum % 10;
					}
					j--;
				} else if (j < 0 && i >= 0) {
					sum = 1 + arr1[i];
					if (sum <= 9) {
						isCarry = false;
						arr3[k] = sum;
					} else {
						isCarry = true;
						arr3[k] = sum % 10;
					}
					i--;
				} else if (i < 0 && j < 0) {
					if (isCarry) {
						arr3[k] = 1;
					} else {
						arr3[k] = 0;
					}
				}
			} else {
				if (i < 0 && j >= 0) {
					arr3[k] = arr2[j];
					j--;
				} else if (j < 0 && i >= 0) {
					arr3[k] = arr1[i];
					i--;
				}
			}
		k--;
		}
		return arr3;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Two random integer arrays are given A1 and A2, in which numbers from 0 to 9 are present at every index (i.e. single digit integer 
		 is present at every index of both given arrays).
		 
		 You need to find sum of both the input arrays (like we add two integers) and put the result in another array 
		 i.e. output array (output arrays should also contain only single digits at every index). 
		 
		 The size A1 & A2 can be different. 
		 
		 Note : Output array size should be 1 more than the size of bigger array and place 0 at the 0th index if there is no carry. 
		 No need to print the elements of output array.
		 
		 Input format:
		 Line 1 : Integer n1 (A1 Size) 
		 Line 2 : A1 elements (separated by space) 
		 Line 3 : Integer n2 (A2 Size) 
		 Line 4 : A2 elements (separated by space)
		 
		 Output format:
		 Output array elements (separated by space)
		 
		 Constraints:
		 1 <= n1, n2 <= 10^6
		 
		 Sample Input 1:
		 3
		 6 2 4
		 3
		 7 5 6
		 
		 Sample Output 1:
		 1 3 8 0
		 
		 Sample Input 2:
		 3
		 8 5 2
		 2
		 1 3
		 
		 Sample Output 2:
		 0 8 6 5
		 
		 */
		
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int[] arr3 = sumOf2Arrays(arr1, arr2);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
			
		}
		
	}

}
