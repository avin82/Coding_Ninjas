package recursion;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class QuickSort {
	
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
	
	public static void quickSort(int[] input) {
		quickSort(input, new int[input.length], 0, input.length - 1);
	}
	
	public static void quickSort(int[] input, int[] temp, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivotPos = partition(input, temp, start, end);
		quickSort(input, temp, start, pivotPos - 1);
		quickSort(input, temp, pivotPos + 1, end);
	}
	
	public static int partition(int[] input, int[] temp, int start, int end) {
		for (int i = start; i <= end; i++) {
			temp[i] = input[i];
		}
		int pivot = temp[start];
		int count = 0;
		for (int i = start + 1; i <= end; i++) {
			if (temp[i] <= pivot) {
				count++;
			}
		}
		int pivotPos = start + count;
		if (pivotPos == start) {
			return pivotPos;
		}
		swap(input, start, pivotPos);
		int i = start, j = end;
		while (i < pivotPos && j > pivotPos) {
			if (input[i] <= pivot) {
				i++;
			} else {
				if (input[j] <= pivot) {
					swap(input, i, j);
					i++;
					j--;
				} else {
					j--;
				}
			}
		}
		return pivotPos;
	}
	
	public static void swap(int[] input, int a, int b) {
		int temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Sort an array A using Quick Sort. 
		 
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
		quickSort(arr);
		System.out.print("Array after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
