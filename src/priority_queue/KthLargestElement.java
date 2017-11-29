package priority_queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
	
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
	
	public static int kthLargest(int arr[], int k) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		int i = 0;
		for (; i < k; i++) {
			pQueue.add(arr[i]);
		}
		for (; i < arr.length; i++) {
			if (pQueue.element() < arr[i]) {
				pQueue.remove();
				pQueue.add(arr[i]);
			}
		}
		return pQueue.element();
	}
	
	public static void main(String[] args) {
		/*
		 Given an array A of random integers and an integer k, find and return the kth largest element 
		 in the array. 
		 
		 Try to do this question in less than O(nlogn) time. 
		 
		 Input Format : 
		 Line 1 : An integer N i.e. size of the array 
		 Line 2 : N integers which are elements of the array, separated by spaces 
		 Line 3 : An integer k 
		 
		 Output Format : 
		 kth largest element 
		 
		 Input Constraints : 
		 1 <= N, Ai, k <= 10^5 
		 
		 Sample Input 1 : 
		 6 
		 9 4 8 7 11 3 
		 2 
		 
		 Sample Output 1 : 
		 9 
		 
		 Sample Input 2 : 
		 8 
		 2 6 10 11 13 4 1 20 
		 4 
		 
		 Sample Output 2 : 
		 10
		 */
		int[] arr = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer k to find the kth largest element in the given array: ");
		int k = scanner.nextInt();
		System.out.println(kthLargest(arr, k));
	}
}
