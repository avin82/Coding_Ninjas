
import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int fah = scanner.nextInt();
		// int cel = (5/9)*(fah - 32);
		// int cel = (5 * (fah - 32)) / 9;
		int cel = (int)((5.0 / 9) * (fah - 32));
		System.out.println(cel);
		
		System.out.println(9/5);
		System.out.println(9.0/5);
		
		System.out.println(9 + 5);
		System.out.println(9 - 5);
		System.out.println(9 / 5);
		System.out.println(9 * 5);
		System.out.println(9 % 5);
		
		System.out.println('a' / 3);
		
		char c = 'a';
		char j = (char)(c + 3);
		System.out.println(j);
		
		System.out.println('A' + 1);
		System.out.println('a' + 'b');
		
	}

}
