package arrays;

import java.util.Scanner;

public class ArrayIntersection {
	
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
	
	public static void arrayIntersectionElements(int arr1[], int arr2[]) {
		
		for(int i = 0; i < arr1.length; i++) { 
			for(int j = 0; j < arr2.length; j++) { 
				if(arr1[i] == arr2[j]) { 
					System.out.println(arr1[i]); 
					arr2[j] = Integer.MIN_VALUE; 
					break; 
				} 
			} 
		}
		
	}
	
	public static void main(String[] args) {
		
		/*
		 Given two random integer arrays of size m and n, print their intersection. That is, print all the elements 
		 that are present in both the given arrays. 
		 Input arrays can contain duplicate elements. 
		 
		 Note : Order of elements are not important 
		 
		 Input format:
		 
		 Line 1 : Array 1 Size 
		 Line 2 : Array 1 elements (separated by space) 
		 Line 3 : Array 2 Size 
		 Line 4 : Array 2 elements (separated by space)
		 
		 Output Format:
		 
		 Print intersection elements in different lines
		 
		 Constraints:
		 1 <= m, n <= 10^3
		 
		 Sample Input 1:
		 6
		 2 6 8 5 4 3
		 4
		 2 3 4 7
		 
		 Sample Output 1:
		 2
		 4
		 3
		 
		 Sample Input 2:
		 4
		 2 6 1 2
		 5
		 1 2 3 4 2
		 
		 Sample Output 2:
		 2
		 2
		 1
		 
		 Sample Input 3:
		 3
		 2 2 2
		 3
		 2 1 2
		 
		 Sample Output 3:
		 2
		 2
		 
		 */
		
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		arrayIntersectionElements(arr1, arr2);
	}

}
