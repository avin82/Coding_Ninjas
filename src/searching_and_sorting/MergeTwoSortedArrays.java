package searching_and_sorting;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	
	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter the elements of the sorted array separated by space or return: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		return arr3;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given two sorted arrays of Size M and N respectively, merge them into a third array such that the third array is also sorted.
		 
		 Input Format:
		 Line 1 : Size of first array i.e. M 
		 Line 2 : M elements of first array separated by space 
		 Line 3 : Size of second array i.e. N 
		 Line 4 : N elements of second array separated by space
		 
		 Output Format:
		 M + N integers i.e. elements of third sorted array separated by spaces.
		 
		 Constraints:
		 1 <= M, N <= 10^6
		 
		 Sample Input:
		 5
		 1 3 4 7 11
		 4
		 2 4 6 13
		 
		 Sample Output:
		 1 2 3 4 4 6 7 11 13
		 
		 */
		
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int[] arr3 = merge(arr1, arr2);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
			
		}
		
	}

}
