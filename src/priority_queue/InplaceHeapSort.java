package priority_queue;

import java.util.Scanner;

public class InplaceHeapSort {
	
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
	
	private static void insertIntoVirtualHeap(int[] arr, int i) {
		int childIndex = i;
		int parentIndex = (childIndex - 1) / 2;
		while(childIndex > 0){
			if(arr[childIndex] < arr[parentIndex] ){
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else{
				return;
			}
		}

	}
	
	private static int removeMinFromVirtualHeap(int[] arr, int heapSize) {

		int temp = arr[0];
		arr[0] = arr[heapSize - 1];
		heapSize--;
		int index = 0;
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;

		while(leftChildIndex < heapSize){

			int minIndex = index;
			if(arr[leftChildIndex] < arr[minIndex]){
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]){
				minIndex = rightChildIndex;
			}
			if(minIndex != index){
				int temp1 = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex]  = temp1;
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}else{
				break;
			}
		}
		return temp;
	}
	
	public static void inplaceHeapSort(int input[]) {
		for(int i = 0; i < input.length; i++){
			insertIntoVirtualHeap(input,i);
		}
		for(int i = 0; i < input.length; i++){
			input[input.length - 1 - i] = removeMinFromVirtualHeap(input, input.length - i);
		}
	}
	
	public static void main(String[] args) {
		/*
		 Given an integer array of size n. Sort this array (in decreasing order) using heap sort. 
		 
		 Space complexity should be O(1). 
		 
		 Input Format : 
		 Line 1 : Integer n, Array size 
		 Line 2 : Array elements, separated by space 
		 
		 Output Format : 
		 Array elements after sorting 
		 
		 Constraints : 
		 1 <= n <= 10^6 
		 
		 Sample Input: 
		 6 
		 2 6 8 5 4 3 
		 
		 Sample Output: 
		 8 6 5 4 3 2
		 */
		int[] arr = takeInput();
		inplaceHeapSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
