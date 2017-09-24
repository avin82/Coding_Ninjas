package arrays;

import java.util.Scanner;

public class SwapAlternateElementsOfArray {
	
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
	
	public static void printArray(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] swapAlternateArrayElements(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i+= 2) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		/*
		 Given an array of length N, swap every pair of alternate elements in the array. 
		 
		 Input Format:
		 Line 1 : An Integer N i.e. size of array 
		 Line 2 : N integers which are elements of the array, separated by spaces
		 
		 Output Format:
		 Elements after swapping, separated by space.
		 
		 Sample Input 1:
		 6
		 9 3 6 12 4 32
		 
		 Sample Output 1:
		 3 9 12 6 32 4
		 
		 Sample Input 2:
		 9
		 9 3 6 12 4 32 5 11 19
		 
		 Sample Output 2:
		 3 9 12 6 32 4 11 5 19
		 
		 */
		
		int[] arr = takeInput();
		swapAlternateArrayElements(arr);
		printArray(arr);
	}

}
