package StringBuffer;

public class Revese {

	public static void main(String[] args) {
		char ch[] = { 'R', 'o', 'h', 'a', 'n' };
		String s = new String(ch);
		System.out.println(s);

		StringBuffer sb = new StringBuffer("Rohan");
		sb.reverse();
		System.out.println(sb);

	}
}
