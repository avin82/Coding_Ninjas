package arrays;

public class NonPrimitiveStorageDemo2 {
	
	public static void printArray(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void incrementArray(int arr[]) {
		arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
			
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		incrementArray(arr);
		printArray(arr);
	}

}
