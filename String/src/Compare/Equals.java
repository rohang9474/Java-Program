package Compare;

public class Equals {
	
	// It can be compare by equals() method.

	public static void main(String[] args) {
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = new String("sachin");
		String s4 = "savrav";
		String s5="SACHIN";

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // false
		
		System.out.println(s1.equals(s5)); // case are different
		System.out.println(s1.equalsIgnoreCase(s5)); // ignore case

	}

}
