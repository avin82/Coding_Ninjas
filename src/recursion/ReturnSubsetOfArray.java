package recursion;

import java.util.Scanner;

public class ReturnSubsetOfArray {
	
	public static int[][] subsetArray2D;
	public static int[] temp;
	public static int i = 0;
	public static int j = 0;
	
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
	
	public static int[][] subsets(int[] input) {
		subsetArray2D = new int[(int)Math.pow(2, input.length)][input.length];
		temp = new int[input.length];
		return subsets(input, temp, 0);
	}
	
	public static int[][] subsets(int[] input, int[] subset, int a) {
		if (a == input.length) {
			for (j = 0; j < a; j++) {
				subsetArray2D[i][j] = input[j];
				if (i == subsetArray2D.length - 1) {
					System.out.print(subsetArray2D[i][j] + " ");
				}
			}	
			return subsetArray2D;
		} else {
			int count = 0;
			temp[a] = 0;
			subsets(input, subset, a + 1);
			for (j = 0; j < subset.length; j++) {
				subsetArray2D[i][j] = subset[j];
				if (subset[j] == 0) {
					count++;
					if (count == 3) {
						System.out.print("");
					}
					continue;
				} else {
					System.out.print(subsetArray2D[i][j] + " ");
				}
			}
			System.out.println();
			i++;
			subset[a] = input[a];
			subsets(input, subset, a + 1);
		}
		return subsetArray2D;
	}
	
	public static void main(String[] args) {
		
		int[] arr = takeInput();
		int[][] subsetArray2D = subsets(arr);
		System.out.println("Subsets of the given array are as given below:");
		for (int i = 0; i < subsetArray2D.length; i++) {
			for (int j = 0; j < subsetArray2D[0].length; j++) {
				System.out.print(subsetArray2D[i][j] + " ");
			}
			System.out.println();
		}
	}
}
