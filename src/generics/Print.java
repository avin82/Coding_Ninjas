package generics;

import java.util.Iterator;

import classes_and_objects.Vehicle;
import interfaces.NewVehicle;
import test2.Print2DArray;

public class Print {
	
	public static <T extends PrintInterface> void printArray(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer a[] = new Integer[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		String[] s = new String[10];
		for (int i = 0; i < s.length; i++) {
			s[i] = "abc";
		}
//		printArray(a);
//		printArray(s);
		
		NewVehicle[] v = new NewVehicle[10];
		for (int i = 0; i < 10; i++) {
			v[i] = new NewVehicle();
		}
		printArray(v);
		JavaStudent[] j = new JavaStudent[10];
		for (int i = 0; i < 10; i++) {
			j[i] = new JavaStudent();
		}
		printArray(j);
	}

}
