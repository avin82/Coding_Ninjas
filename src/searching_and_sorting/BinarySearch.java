package searching_and_sorting;

import java.util.Scanner;

public class BinarySearch {
	
	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter the elements of the array separated by space or return: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
		public static int binarySearch(int[] arr, int num) {
			int start = 0, end = arr.length - 1, middle = (start + end) / 2;
			while(num != arr[middle]) {
				if (num < arr[middle]) {
					end = middle - 1; 
					middle = (start + end) / 2;
					if (start > end) {
						return -1;
					}
				} else {
					start = middle + 1;
					middle = (start + end) / 2;
					if (start == end) {
						if (num != arr[middle]) {
							return -1;
						} else {
							break;
						}
					}
				}
			}
			return middle;
		}
	
	public static void main(String[] args) {
		
		/*
		 Given a sorted integer array (in ascending order) and an element x. You need to search this 
		 element x in the given input array using binary search. Return the index of element in the input. 
		 
		 Indexing starts from 0. 
		 Return -1 if x is not present in the input array. 
		 
		 Input format:
		 Line 1 : Integer N, Array Size 
		 Line 2 : Array elements (separated by space) 
		 Line 3 : Element to be searched (i.e. x)
		 
		 Output Format:
		 Index
		 
		 Constraints:
		 1 <= N <= 10^6
		 
		 Sample Input 1:
		 7
		 1 3 7 9 11 12 45
		 3
		 
		 Sample Output 1:
		 1
		 
		 Sample Input 2:
		 7
		 1 2 3 4 5 6 7
		 9
		 
		 Sample Output 2:
		 -1
		 
		 */
		
		int[] arr = takeInput();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number x to be searched in the given input array using binary search: ");
		int x = scanner.nextInt();
		System.out.printf("The index of the searched element x i.e. %d in the given array using binary search is: %d", x, binarySearch(arr, x));
		
	}

}
