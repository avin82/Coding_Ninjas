package Test2;

import java.util.Scanner;

public class LeadersInArray {
	
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
	
	public static void leaders(int[] input) {
		int i;
		for (i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] >= input[j]) {
					if (j == input.length - 1) {
						System.out.print(input[i] + " ");
					}
					continue;
				} else {
					break;
				}
			}
		}
		System.out.println(input[i]);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an integer array A of size n. Find and print all the leaders present in the input array. 
		 An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) 
		 are less than or equal to A[i]. 
		 
		 Print all the leader elements separated by space and in the same order they are present in the input array. 
		 
		 Input Format : 
		 Line 1 : Integer n, size of array 
		 Line 2 : Array A elements (separated by space) 
		 
		 Output Format : 
		 leaders of array (separated by space) 
		 
		 Constraints : 
		 1 <= n <= 10^6 
		 
		 Sample Input 1 : 
		 6 
		 3 12 34 2 0 -1 
		 
		 Sample Output 1 : 
		 34 2 0 -1 
		 
		 Sample Input 2 : 
		 5 
		 13 17 5 4 6 
		 
		 Sample Output 2 : 
		 17 6
		 
		 */
		
		int[] input = takeInput();
		leaders(input);
	}

}
