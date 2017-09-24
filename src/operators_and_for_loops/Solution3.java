package operators_and_for_loops;

public class Solution3 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		if (x++ > 10 && ++y > 20) {
			System.out.print("Inside if ");
		} else {
			System.out.print("Inside else ");
		}
		System.out.println(x +" "+y);
	}

}
