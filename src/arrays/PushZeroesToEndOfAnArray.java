package arrays;

import java.util.Scanner;

public class PushZeroesToEndOfAnArray {
	
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
	
	public static void pushZeroesAtEndInArray(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
			arr[j] = arr[i];
			j++;
		}
		for (int i = arr.length - count; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a random integer array, push all the zeros that are present to end of the array. 
		 The respective order of other elements should remain same. 
		 Change in the input array itself. You don't need to return or print elements. Don't use extra array. 
		 
		 Note : You need to do this in one scan of array only.
		 
		 Input format:
		 Line 1 : Integer N, 
		 Array Size Line 2 : Array elements (separated by space)
		 
		 Output format:
		 Array elements (separated by space)
		 
		 Constraints:
		 1 <= N <= 10^6
		 
		 Sample Input 1:
		 7
		 2 0 4 1 3 0 28
		 
		 Sample Output 1:
		 2 4 1 3 28 0 0
		 
		 Sample Input 2:
		 5
		 0 3 0 2 0
		 
		 Sample Output 2:
		 3 2 0 0 0
		 
		 */
		
		int[] arr = takeInput();
		pushZeroesAtEndInArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			
		}
	}

}
