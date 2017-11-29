package priority_queue;

import java.util.Scanner;

public class CheckMaxHeap {
	
	public static boolean maxHeapProperty = true;
	
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
	
	public static boolean checkMaxHeap(int arr[]) {
		int parentIndex, leftChildIndex, rightChildIndex;
		for (int i = 0; i < arr.length; i++) {
			parentIndex = i;
			leftChildIndex = 2 * parentIndex + 1;
			rightChildIndex = 2 * parentIndex + 2;
			if (leftChildIndex < arr.length) {
				if (arr[parentIndex] < arr[leftChildIndex]) {
					maxHeapProperty = false;
					break;
				}
				if (rightChildIndex < arr.length && arr[parentIndex] < arr[rightChildIndex]) {
					maxHeapProperty = false;
				}
			}
		}
		return maxHeapProperty;
	}
	
	public static void main(String[] args) {
		/*
		 Given an array of integers, check whether it represents max-heap or not. 
		 
		 Return true or false. 
		 
		 Input Format : 
		 Line 1 : An integer N i.e. size of the array 
		 Line 2 : N integers which are elements of the array, separated by spaces 
		 
		 Output Format : 
		 true if it represents max-heap and false if it is not a max-heap 
		 
		 Constraints : 
		 1 <= N <= 10^5 
		 1 <= Ai <= 10^5
		 */
		int[] arr = takeInput();
		System.out.println(checkMaxHeap(arr));
	}
}
