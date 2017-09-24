package arrays;

import java.util.Scanner;

public class SortAnArrayOfBinaryValues {
	
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
	
	public static void sortBinaryValueArray(int input[]) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			input[i] = 0;
		}
		for (int i = count; i < input.length; i++) {
			input[i] = 1;
		}
	}
	
	public static void main(String[] args) {
		
		int[] input = takeInput();
		
		
	}

}
