package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
		
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if (disks == 0) {
			return;
		} else if (disks == 1) {
			System.out.println(Character.toString(source) + " " + Character.toString(destination));
		} else {
			towerOfHanoi(disks - 1, source, destination, auxiliary);
			System.out.println(Character.toString(source) + " " + Character.toString(destination));
			towerOfHanoi(disks - 1, auxiliary, source, destination);
		}
	} 
	
	public static void main(String[] args) {
		
		/*
		 
		 Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle 
		 is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are : 
		 
		 1) Only one disk can be moved at a time. 
		 2) A disk can be moved only if it is on the top of a rod. 
		 3) No disk can be placed on the top of a smaller disk. 
		 
		 Print the steps required to move n disks from source rod to destination rod. 
		 
		 Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'. 
		 
		 Input Format : 
		 Integer n 
		 
		 Output Format : 
		 Steps in different lines (in one line print source and destination rod name separated by space) 
		 
		 Sample Input : 
		 2 
		 
		 Sample Output : 
		 a b
		 a c
		 b c
		 
		 */
		
		char source = 'a';
		char auxiliary = 'b';
		char destination = 'c';
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of disks to be moved from source rod \'a\' to destination rod \'c\' using "
				+ "an auxiliary rod \'b\': ");
		int n = scanner.nextInt();
		towerOfHanoi(n, source, auxiliary, destination);
	}

}
