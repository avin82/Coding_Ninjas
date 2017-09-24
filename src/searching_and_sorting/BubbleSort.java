package searching_and_sorting;

import java.util.Scanner;

public class BubbleSort {
	
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
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a random integer array. Sort this array using bubble sort. Change in the input array itself. 
		 You don't need to return or print elements. 
		 Input format:
		 Line 1 : Integer N, Array Size 
		 Line 2 : Array elements (separated by space)
		 
		 Constraints:
		 1 <= N <= 10^3
		 
		 Sample Input 1:
		 7
		 2 13 4 1 3 6 28
		 
		 Sample Output 1:
		 1 2 3 4 6 13 28
		 
		 Sample Input 2:
		 5
		 9 3 6 2 0
		 
		 Sample Output 2:
		 0 2 3 6 9
		 
		 */
		
		int[] arr = takeInput();
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}

}
