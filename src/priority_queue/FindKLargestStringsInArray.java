package priority_queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class MaxComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() > o2.length()) {
			return -1;
		} else if (o1.length() < o2.length()) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class FindKLargestStringsInArray {
	
	public static ArrayList<String> findkLargestStringsInArray(String input[], int k) {
		MaxComparator maxComparator = new MaxComparator();
		PriorityQueue<String> pQueue = new PriorityQueue<>(maxComparator);
		ArrayList<String> output = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			pQueue.add(input[i]);
		}
		while (k > 0) {
			output.add(pQueue.remove());
			k--;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = scanner.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter the elements of the array separated by space or return: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}
		System.out.println("Enter an integer k to find k largest strings from the given array: ");
		int k = scanner.nextInt();
		ArrayList<String> list = findkLargestStringsInArray(arr, k);
		for (String element : list) {
			System.out.println(element);
		}
	}

}
