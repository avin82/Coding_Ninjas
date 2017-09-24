package arrays;

public class PrimitiveAndNonPrimitiveStorageDemo1 {
	
	public static void printArray(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void increment(int i) {
		i++;
	}
	
	public static void incrementArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
			
		}
	}
	
	public static void main(String[] args) {
		int i = 10;
		increment(i);
		System.out.println(i);
		
		int[] arr = {1, 2, 3, 4, 5};
		incrementArray(arr);
		printArray(arr);	
	}

}
