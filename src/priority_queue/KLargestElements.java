package priority_queue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElements {
	
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
	
	public static ArrayList<Integer> kLargest(int input[], int k) {
		ArrayList<Integer> output = new ArrayList<>();
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		for (int i = 0; i < input.length; i++) {
			pQueue.add(input[i]);
		}
		while (pQueue.size() != k) {
			pQueue.remove();
		}
		while (!pQueue.isEmpty()) {
			output.add(pQueue.remove());
		}
		return output;
	}
	
	public static void main(String[] args) {
		/*
		 You are given with an integer k and an array of integers that contain numbers in random order. 
		 Write a program to find k largest numbers from given array. You need to save them in an array 
		 and return it. 
		 
		 Time complexity should be O(nlogk) and space complexity should be not more than O(k). 
		 
		 Order of elements in the output is not important. 
		 
		 Input Format : 
		 Line 1 : Size of array (n) 
		 Line 2 : Array elements (separated by space) 
		 Line 3 : Integer k 
		 
		 Output Format : 
		 k largest elements 
		 
		 Sample Input : 
		 13 
		 2 12 9 16 10 5 3 20 25 11 1 8 6 
		 4 
		 
		 Sample Output : 
		 12 
		 16 
		 20 
		 25	
		 */
		int[] arr = takeInput();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer k to find k largest elements from the given array: ");
		int k = scanner.nextInt();
		ArrayList<Integer> list = kLargest(arr, k);
		for (Integer element : list) {
			System.out.println(element);
		}
	}

}
