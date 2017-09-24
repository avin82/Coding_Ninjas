package strings_and_2d_arrays;

public class StringUsage {
	
	public static void printString(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
		}
	}
	
	public static void main(String[] args) {
		
		char c = 'c';
		String str = "abcdefgh";
		System.out.println(str.charAt(1));
		System.out.println(str.length());
		System.out.println(str.substring(1, 6));
		System.out.println(str.substring(3));
		System.out.println(str.substring(0));
		System.out.println(str);
		System.out.println(str.substring(0) == str);
		System.out.println(str.substring(str.length()));
		String temp = str.substring(str.length());
		System.out.println(temp.length());
		System.out.println(str.substring(1, 1));
		String temp2 = str.substring(1, 1);
		System.out.println(temp2.length());
//		System.out.println(str.substring(str.length() + 1));	Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
//		System.out.println(str.charAt(9));	java.lang.StringIndexOutOfBoundsException: String index out of range: 9
		System.out.println(str.substring(str.length() - 1));
		System.out.println(str.contains("def"));
		System.out.println(str.contains("fed"));
		printString(str);
		System.out.println("*********************");
		str = "abc";
		printString(str);
		System.out.println("*********************");
		str = str + "def";
		System.out.println(str);
		System.out.println(str.concat("ghi"));
		System.out.println(str);
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		if (arr1 == arr2) {
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}
		
		int[] arr3 = {1, 2, 3};
		int[] arr4 = arr3;
		if (arr3 == arr4) {
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}
		
		String str1 = "abc";
		String str2 = "abc";
		if (str1 == str2) {		// String pool optimization
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}
		if (str1.equals(str2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}
	}

}
