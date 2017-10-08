package recursion;

import java.util.Scanner;

public class MergeSort {
	
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
	
	public static int findmiddle(int start, int end) {
		return (start + end) / 2;
	}
	
	public static void mergeSort(int[] input, int[] temp, int start, int end) {
		if (start >= end) {
			return;
		}
		int middle = findmiddle(start, end);
		mergeSort(input, temp, start, middle);
		mergeSort(input, temp, middle + 1, end);
		sortAndMergeHalves(input, temp, start, end);
	}
	
	public static void sortAndMergeHalves(int[] input, int[] temp, int start, int end) {
		for (int i = start; i <= end; i++) {
			temp[i] = input[i];	
		}
		int middle = findmiddle(start, end);
		int i = start, j = middle + 1, k = start;
		while (i <= middle && j <= end) {
			if (temp[i] <= temp[j]) {
				input[k] = temp[i];
				i++;
			} else {
				input[k] = temp[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			input[k] = temp[i];
			i++;
			k++;
		}
		while (j <= end) {
			input[k] = temp[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int[] input) {
		mergeSort(input, new int[input.length], 0, input.length - 1);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Sort an array A using Merge Sort. 
		 
		 Change in the input array itself. So no need to return or print anything. 
		 
		 Input format : 
		 Line 1 : Integer n i.e. Array size 
		 Line 2 : Array elements (separated by space) 
		 
		 Output format : 
		 Array elements in increasing order (separated by space) 
		 
		 Constraints : 
		 1 <= n <= 1000 
		 
		 Sample Input: 
		 6 
		 2 6 8 5 4 3 
		 
		 Sample Output: 
		 2 3 4 5 6 8
		 
		 */
		
		int[] arr = takeInput();
		System.out.print("Array before sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		mergeSort(arr);
		System.out.print("Array after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
