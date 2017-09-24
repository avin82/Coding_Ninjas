package arrays;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	
	public static void printArray(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] arrangeElementsInArray(int n) {
		int[] arr = new int[n];
		int i = 0, j = n - 1; 
		for (int k = 1; k <= n; k++) {
			if (k % 2 == 0) {
				arr[j] = k;
				j--;
			} else {
				arr[i] = k;
				i++;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		/*
		 Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2. 
		 
		 Input Format :
		 Integer n
		 
		 Output Format:
		 Elements of the array separated by space.
		 
		 Sample Input 1:
		 6
		 
		 Sample Output 1:
		 1 3 5 6 4 2
		 
		 Sample Input 2:
		 9
		 
		 Sample Output 2:
		 1 3 5 7 9 8 6 4 2
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number n to put all elements from 1 to n in an array in order - 1,3,.......4,2");
		int n = scanner.nextInt();
		int[] arr = arrangeElementsInArray(n);
		printArray(arr);
		
		
	}

}
