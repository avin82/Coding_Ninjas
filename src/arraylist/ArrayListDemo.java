package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		System.out.println(list1.size());
		list1.add(15);
		list1.add(20);
		list1.add(25);
		list1.add(2, 50);
		for (int element : list1) {
			System.out.print(element + " ");
		}
		System.out.println();
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		list2.add("Sunday");
		list2.add("Monday");
		list2.add("Tuesday");
		list2.add("Wednesday");
		list2.add("Thursday");
		list2.add("Friday");
		list2.add("Friday");
		for (String element : list2) {
			System.out.print(element + " ");
		}
		System.out.println();
		list2.set(6, "Saturday");
		for (String element : list2) {
			System.out.print(element + " ");
		}
		System.out.println();
		list2.add("Saturday");
		for (String element : list2) {
			System.out.print(element + " ");
		}
		System.out.println();
		list2.remove(7);
		for (String element : list2) {
			System.out.print(element + " ");
		}
		System.out.println();
		
	}
}
