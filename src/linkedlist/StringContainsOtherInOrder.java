package linkedlist;

import java.util.Scanner;

public class StringContainsOtherInOrder {
	public static int i = 0, j = 0;
	public static boolean smallAnswer = false;
	
	public static boolean checkSequence(String a, String b) {
		if (i >= a.length()) {
			return false;
		} else if (j >= b.length()) {
			return true;
		}
		if (a.charAt(i) == b.charAt(j)) {
			smallAnswer = true;
			i++;
			j++;
		} else {
			i++;
		}
		return smallAnswer && checkSequence(a, b);
	}
	
	public static void main(String[] args) {
		String a = "abcde";
		String b = "acd";
		System.out.println(checkSequence(a, b));
	}
}
