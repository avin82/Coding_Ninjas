package maps;

public class MapImplementationDemo {
	
	public static void main(String[] args) {
		/*
		 * Change numBuckets value to 5 in Map.java and execute this file to understand how loadFactor changes
		 * and rehashing is done.
		 */
		Map<String, Integer> map = new Map<>();
		for (int i = 0; i < 20; i++) {
			map.insert("abc" + i, i + 1);
			System.out.println("i = " + i + " loadFactor = " + map.loadFactor());
		}
		map.removeKey("abc3");
		map.removeKey("abc7");
		for (int i = 0; i < 20; i++) {
			System.out.println("abc" + i + ": " + map.getValue("abc" + i));
		}
	}

}
