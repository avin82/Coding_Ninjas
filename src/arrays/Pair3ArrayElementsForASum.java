	package arrays;

import java.util.Scanner;

	public class Pair3ArrayElementsForASum {
	
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
	
	public static void pairArrayElementsForASum(int arr[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number x to pair the array 3 elements of array whose sum is x: ");
		int x = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (i != j && j != k) {
						if (x == arr[i] + arr[j] + arr[k]) {
							if (arr[i] < arr[j] && arr[j] < arr[k]) {
								System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
							} else if (arr[i] < arr[k] && arr[k] < arr[j]) {
								System.out.println(arr[i] + " " + arr[k] + " " + arr[j]);
							} else if (arr[j] < arr[k] && arr[k] < arr[i]) {
								System.out.println(arr[j] + " " + arr[k] + " " + arr[i]);
							} else if (arr[j] < arr[i] && arr[i] < arr[k]) {
								System.out.println(arr[j] + " " + arr[i] + " " + arr[k]);
							} else if (arr[k] < arr[i] && arr[i] < arr[j]) {
								System.out.println(arr[k] + " " + arr[i] + " " + arr[j]);
							} else if (arr[k] < arr[j] && arr[j] < arr[i]) {
								System.out.println(arr[k] + " " + arr[j] + " " + arr[i]);
							}
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		
		/*
		 Given a random integer array and a number x. Find and print the triplets of elements in the array which sum to x. 
		 While printing a triplet, print the smallest element first. 
		 That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 triplets which have 
		 to be printed on 1st line. You can print triplets in any order, just be careful about the order of elements in a triplet.
		 
		 Input Format:
		 Line 1 : Integer N (Array Size) 
		 Line 2 : Array elements (separated by space) 
		 Line 3 : Integer x
		 
		 Output Format:
		 Line 1 : Triplet 1 elements (separated by space) 
		 Line 2 : Triplet 3 elements (separated by space) 
		 Line 3 : and so on
		 
		 Constraints:
		 1 <=N <= 1000
		 1 <=x <= 100
		 
		 Sample Input:
		 7
		 1 2 3 4 5 6 7
		 12
		 
		 Sample Output:
		 1 4 7
		 1 5 6
		 2 3 7
		 2 4 6
		 3 4 5
		 
		 */
		
		int[] arr = takeInput();
		pairArrayElementsForASum(arr);
	}

}
