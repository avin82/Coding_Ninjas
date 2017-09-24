package while_loop;

import java.util.Scanner;

public class CelsiusToFahrenheitTable {
	
	public static void main(String[] args) {
		
		/*
		 * Given three values - Start Fahrenheit Value (s), End Fahrenheit Value (e) and Step Size(w), you need to convert all Fahrenheit
		 * values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
		 * Input format: 3 integers - s, e and w respectively separated by space.
		 * Output format: Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value.
		 * On Fahrenheit value and its corresponding Celsius value should be separated by tab ("\t").
		 * Sample Input: 0 100 20
		 * Sample Output:
		 * 0		-17
		 * 20	-6
		 * 40	4
		 * 60	15
		 * 80	26
		 * 100	37
		 */
		
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int e = scanner.nextInt();
		int w = scanner.nextInt();
		int i = s, celsius = 0;
		while (i <= e) {
			celsius = (int)((5.0 / 9) * (i - 32));
			System.out.println(i + "\t" + celsius);
			i += w;
		}
	}

}
