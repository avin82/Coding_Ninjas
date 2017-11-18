package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
	
	public static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> seen = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (seen.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			seen.put(arr[i], true);
		}
		return output;
	}
	
	public static void main(String[] args) {
		/*
		 Remove duplicate elements from a given array and return the unique elements as elements of an array list.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of array: ");	
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements seperated by space: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		ArrayList<Integer> uniqueList = removeDuplicates(arr);
		for (int i = 0; i < uniqueList.size(); i++) {
			System.out.println(uniqueList.get(i));
		}
	}
}
