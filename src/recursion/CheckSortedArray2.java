package recursion;

import java.util.Scanner;

public class CheckSortedArray2 {
	
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
	
	public static boolean checkSorted(int[] arr) {
		if (arr.length <= 1) {
			return true;
		}
		if (arr[0] > arr[1]) {
			return false;
		}
		int[] smallerArr = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallerArr[i - 1] = arr[i];
		}
		return checkSorted(smallerArr);
	}
	
	public static void main(String[] args) {
		
		int[] arr = takeInput();
		System.out.printf("Array is sorted: %b", checkSorted(arr));
		
	}

}
