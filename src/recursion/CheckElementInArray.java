package recursion;

import java.util.Scanner;

public class CheckElementInArray {
	
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
	
	public static boolean checkElement(int[] input, int x) {
		if (input.length == 1) {
			return input[0] == x;
		}

		int[] smallerArr = new int[input.length - 1];
		boolean temp = false;
		boolean isPresent = false;
		int i;
		for (i = 0; i < input.length - 1; i++) {
			smallerArr[i] = input[i + 1];
		}
		temp = smallerArr[0] == x;
		return temp || checkElement(smallerArr, x);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an array of length N and an integer x, you need to find if x is present in the array or not. 
		 Return true or false. 
		 
		 Do this recursively. 
		 
		 Input Format : 
		 Line 1 : An Integer N i.e. size of array 
		 Line 2 : N integers which are elements of the array, separated by spaces 
		 Line 3 : Integer x 
		 
		 Output Format : 
		 true or false 
		 
		 Constraints : 
		 1 <= N <= 10^3 
		 
		 Sample Input : 
		 3 
		 9 8 10 
		 8 
		 
		 Sample Output : 
		 true
		 
		 */
		
		int[] input = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer x to check its presence in the array: ");
		int x = scanner.nextInt();
		System.out.printf("Element %d is present in the array: %b", x, checkElement(input, x));
	}

}
