import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		
		boolean isEqualTo = (i == j);
		boolean notEqualTo = (i != j);
		boolean isGreaterThan = (i > j);
		boolean isGreaterThanOrEqualTo = (i >= j);
		boolean isLessThan = (i < j);
		boolean isLessThanOrEqualTo = (i <= j);
		
		System.out.println("Is Equal " + isEqualTo);
		System.out.println("Is Not Equal " + notEqualTo);
		System.out.println("Is Greater " + isGreaterThan);
		System.out.println("Is Greater Than Or Equal To " + isGreaterThanOrEqualTo);
		System.out.println("Is Less " + isLessThan);
		System.out.println("Is Less Than Or Equal To " + isLessThanOrEqualTo);

	}

}