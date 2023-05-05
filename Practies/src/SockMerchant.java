import java.util.HashMap;

public class SockMerchant {

	public static int sockMerchant(int n, int[] ar) {
		// Initialize HashMap to keep count of each color
		HashMap<Integer, Integer> colorCount = new HashMap<>();
		for (int color : ar) {
			if (colorCount.containsKey(color)) {
				colorCount.put(color, colorCount.get(color) + 1);
			} else {
				colorCount.put(color, 1);
			}
		}

		// Count number of pairs for each color
		int pairCount = 0;
		for (int count : colorCount.values()) {
			pairCount += count / 2;
		}

		return pairCount;
	}

	public static void main(String[] args) {
		int n = 9;
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int result = sockMerchant(n, ar);
		System.out.println(result); // Output: 3
	}
}
