package recursion;

import java.util.Scanner;

public class CheckSortedArray3 {
	
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
	
	private static boolean checkSorted(int[] arr, int startIndex) {
		if (startIndex >= arr.length - 1) {
			return true;
		}
		if (arr[startIndex] > arr[startIndex + 1]) {
			return false;
		}
		return checkSorted(arr, startIndex + 1);
	}
	
	public static boolean checkSorted(int[] arr) {
		return checkSorted(arr, 0);
	}
	
	public static void main(String[] args) {
		
		int[] arr = takeInput();
		System.out.printf("Array is sorted: %b", checkSorted(arr));
	}

}
