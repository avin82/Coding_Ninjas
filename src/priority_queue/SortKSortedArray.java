package priority_queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SortKSortedArray {
	
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
	
	public static void sortKSorted(int[] arr, int k ) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		int i = 0;
		for (; i < k; i++) {
			pQueue.add(arr[i]);
		}
		for (; i < arr.length; i++) {
			arr[i - k] = pQueue.remove();
			pQueue.add(arr[i]);
		}
		for (int j = arr.length - k; j < arr.length; j++) {
			arr[j] = pQueue.remove();
		}
	}
	
	public static void main(String[] args) {
		/*
		 Write a program to sort a k sorted array.
		 
		 Sample Input:
		 Integer k
		 Integer n, Array Size
		 Array elements, separated by space
		 
		 Sample Output:
		 Sorted array elements (increasing order, separated by space)
		 
		 Sample Input 1:
		 3
		 6
		 2 4 1 9 6 8
		 
		 Sample Output 1:
		 
		 1 2 4 6 8 9
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer k to create a k sorted array: ");
		int k = scanner.nextInt();
		int[] arr = takeInput();
		sortKSorted(arr, k);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
