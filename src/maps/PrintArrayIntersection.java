package maps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PrintArrayIntersection {
	
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
	 
	public static void intersection(int[] arr1, int[] arr2) {
		if (arr1.length >= arr2.length) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int value = 1;
			for (int i : arr1) {
				if (map.containsKey(i)) {
					map.put(i, value + 1);
				} else {
					map.put(i, value);
				}
			}
			for (int i : arr2) {
				if (map.containsKey(i)) {
					System.out.println(i);
					int numOfOccurences = map.get(i);
					if (numOfOccurences > 1) {
						numOfOccurences--;
						if (numOfOccurences == 0) {
							map.remove(i);
						} else {
							map.put(i, numOfOccurences);
						}
					}
				}
			}
		} else {
			HashMap<Integer, Integer> map = new HashMap<>();
			int value = 1;
			for (int i : arr2) {
				if (map.containsKey(i)) {
					map.put(i, value + 1);
				} else {
					map.put(i, value);
				}
			}
			for (int i : arr1) {
				if (map.containsKey(i)) {
					System.out.println(i);
					int numOfOccurences = map.get(i);
					if (numOfOccurences > 1) {
						numOfOccurences--;
						if (numOfOccurences == 0) {
							map.remove(i);
						} else {
							map.put(i, numOfOccurences);
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given two random integer arrays, print their intersection. That is, print all the elements 
		 that are present in both the given arrays. 
		 
		 Input arrays can contain duplicate elements. 
		 
		 Note : Order of elements are not important 
		 
		 Input format : 
		 Line 1 : Integer N, Array 1 Size 
		 Line 2 : Array 1 elements (separated by space) 
		 Line 3 : Integer M, Array 2 Size 
		 Line 4 : Array 2 elements (separated by space) 
		 
		 Output format : 
		 Print intersection elements in different lines 
		 
		 Constraints : 
		 1 <= M, N <= 10^6 
		 
		 Sample Input 1 : 
		 6 
		 2 6 8 5 4 3 
		 4 
		 2 3 4 7 
		 
		 Sample Output 1 : 
		 2 
		 4 
		 3 
		 
		 Sample Input 2 : 
		 4 
		 2 6 1 2 
		 5 
		 1 2 3 4 2 
		 
		 Sample Output 2 : 
		 2 
		 2 
		 1
		 */
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}

}
