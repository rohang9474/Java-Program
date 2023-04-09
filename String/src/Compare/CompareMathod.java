package Compare;

public class CompareMathod {

	/*
	 * it can compare value & return integer value that describe if first string is
	 * less than, equals to or greater than second string
	 */

	public static void main(String[] args) {
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = "raten";

		System.out.println(s1.compareTo(s2)); // 0 (s1==s2)
		System.out.println(s1.compareTo(s3)); // 1 (s1>s3)
		System.out.println(s3.compareTo(s1)); // -1 (s3<s1)

	}

}
