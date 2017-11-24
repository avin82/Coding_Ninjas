package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {
	
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
	
	public static ArrayList<Integer> longestSubsequence(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> output = null;
		int value = 1;
		for (int i : arr) {
			map.put(i, value);
		}
		int longestSubsequenceLength = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> tempList = new ArrayList<>();
			tempList.add(arr[i]);
			int count = 1;
			int counter = 1;
			while (map.containsKey(arr[i] + counter)) {
				tempList.add(arr[i] + counter);
				count++;
				counter++;
			}
			if (count > longestSubsequenceLength) {
				longestSubsequenceLength = count;
				output = tempList;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		/*
		 You are given with an array of integers that contain numbers in random order. 
		 Write a program to find the longest possible sub sequence of consecutive numbers 
		 using the numbers from given array. 
		 
		 You need to return the output array which contains consecutive elements. Order of 
		 elements in the output is not important. 
		 
		 Best solution takes O(n) time. 
		 
		 If two arrays are of equal length return the array whose index of smallest element comes first. 
		 
		 Input Format : 
		 Line 1 : Integer n, Size of array 
		 Line 2 : Array elements (separated by space) 
		 
		 Constraints : 
		 1 <= n <= 10^5 
		 
		 Sample Input 1 : 
		 13 
		 2 12 9 16 10 5 3 20 25 11 1 8 6 
		 
		 Sample Output 1 : 
		 8 9 10 11 12 
		 
		 Sample Input 2 : 
		 7 
		 15 13 23 21 19 11 16 
		 
		 Sample Output 2 : 
		 15 16
		 */
		int[] arr = takeInput();
		ArrayList<Integer> list = longestSubsequence(arr);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
