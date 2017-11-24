package maps;

import java.util.HashMap;
import java.util.Scanner;

public class PairsWithDifferenceK {
	
	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Please enter the elements of the array separated by space or return: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static void findPairsDifferenceK(int[] input, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		for(int i : input) { 
			int p1 = i + k; 
			boolean flag = false; 
			if (i == p1) { 
				flag = true; 
			} 
			if (map.containsKey(p1)) { 
				int f2 = map.get(p1); 
				for (int j = 0; j < f2; j++) { 
					if (p1 < i) { 
						System.out.println(p1 + " " + i); 
					} else { 
						System.out.println(i + " " + p1); 
					} 
				}
			} 
			int p2 = i - k; 
			if (map.containsKey(p2) && !flag) { 
				int f2 = map.get(p2); 
				for (int j = 0; j < f2; j++) { 
					if (p2 < i) { 
						System.out.println(p2 + " " + i); 
						} else { 
							System.out.println(i + " " + p2); 
						} 
					} 
				} 
			if (map.containsKey(i)) { 
				map.put(i, map.get(i) + 1); 
			} else { 
				map.put(i, 1); 
			} 
		} 
	}
	
	public static void main(String[] args) {
		/*
		 You are given with an array of integers and an integer K. Write a program to find 
		 and print all pairs which have difference K. 
		 
		 Best solution takes O(n) time. And take difference as absolute. 
		 
		 Input Format : 
		 Line 1 : Integer n, Size of array 
		 Line 2 : Array elements (separated by space) 
		 Line 3 : K 
		 
		 Output format : 
		 Print pairs in different lines (pair elements separated by space). In a pair, smaller element 
		 should be printed first. (Order of different pairs is not important) 
		 
		 Constraints : 
		 1 <= n <= 5000 
		 
		 Sample Input 1 : 
		 4 
		 5 1 2 4 
		 3 
		 
		 Sample Output 1 : 
		 2 5 
		 1 4 
		 
		 Sample Input 2 : 
		 4 
		 4 4 4 4 
		 0 
		 
		 Sample Output 2 : 
		 4 4 
		 4 4 
		 4 4 
		 4 4 
		 4 4 
		 4 4
		 */
		int[] arr = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer k to find and print all the pairs from "
				+ "given array having difference equal to k: ");
		int k = scanner.nextInt();
		findPairsDifferenceK(arr, k);
	}
}
