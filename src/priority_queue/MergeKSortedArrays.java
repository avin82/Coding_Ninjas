package priority_queue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKSortedArrays {
	
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
	
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		ArrayList<Integer> output = new ArrayList<>();
		int maxSize = Integer.MIN_VALUE;
		for (ArrayList<Integer> list : input) {
			if (maxSize < list.size()) {
				maxSize = list.size();
			}
		}
		int i = 0, j = 0;
		while (i != maxSize) {
			j = 0;
			for (; j < input.size(); j++) {
				if (i >= input.get(j).size()) {
					continue;
				} else {
					pQueue.add(input.get(j).get(i));
				}
			}
			i++;
		}
		while (!pQueue.isEmpty()) {
			output.add(pQueue.remove());
		}
		return output;
	}
	
	public static void main(String[] args) {
		/*
		 Given k different arrays, which are sorted individually (in ascending order). 
		 You need to merge all the given arrays such that output array should be sorted (in ascending order). 
		 
		 Hint : Use Heaps. 
		 
		 Input Format : 
		 Line 1 : Integer K 
		 Line 2 : Arrays 1 size (n1) 
		 Line 3 : Array 1 elements (separated by space) 
		 Line 4 : Array 2 size (n2) 
		 and so on for next arrays 
		 
		 Sample Input 1 : 
		 4 
		 3 
		 1 5 9 
		 2 
		 45 90 
		 5 
		 2 6 78 100 234 
		 1 
		 0 
		 
		 Sample Output 1 : 
		 0 1 2 5 6 9 45 78 90 100 234
		 */
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer k: ");
		int k = scanner.nextInt();
		 for (int i = 0; i < k; i++) {
			int[] arr = takeInput();
			ArrayList<Integer> tempList = new ArrayList<>();
			for (int j : arr) {
				tempList.add(j);
			}
			list.add(tempList);
		 }
		 ArrayList<Integer> list2 = mergeKSortedArrays(list);
		 for (Integer element : list2) {
			System.out.print(element + " ");
		}
	}
}
