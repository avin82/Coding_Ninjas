package maps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PairSumToZero {
	
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
	
	public static void pairSum(int[] input, int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int value = 1;
		for (int i : input) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, value);
			}
		}
		int sum = 0;
		for (int i : input) {
			if (i > 0) {
				if (map.containsKey(sum - i)) {
					int temp = map.get(sum - i);
					while (temp > 0) {
						System.out.println((sum - i) + " " + i);
						temp--;
					}
				}
			} 
		}
		for (int i : input) {
			if (i == 0) {
				int temp = map.get(i) - 1;
				while (temp > 0) {
					System.out.println(0 + " " + 0);
					temp--;
				}
				break;
			}
		}
	}
       
	public static void main(String[] args) {
		/*
		 Given a random integer array A of size N. Find and print the pair of elements 
		 in the array which sum to 0. 
		 
		 Array A can contain duplicate elements. 
		 
		 While printing a pair, print the smaller element first. 
		 
		 That is, if a valid pair is (6, -6) print "-6 6". There is no constraint that 
		 out of 5 pairs which have to be printed in 1st line. You can print pairs in 
		 any order, just be careful about the order of elements in a pair. 
		 
		 Input format : 
		 Line 1 : Integer N (Array size) 
		 Line 2 : Array elements (separated by space) 
		 
		 Output format : 
		 Line 1 : Pair 1 elements (separated by space) 
		 Line 2 : Pair 2 elements (separated by space) 
		 Line 3 : and so on 
		 
		 Constraints : 
		 1 <= N <= 10^6 
		 
		 Ai contains all non-zero values S
		 
		 ample Input: 
		 5 
		 2 1 -2 2 3 
		 
		 Sample Output : 
		 -2 2 
		 -2 2
		 */
		int[] arr = takeInput();
		pairSum(arr, arr.length);
	}

}
