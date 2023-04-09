package Compare;

public class SymbolOperator {

	// this operator compare references not values

	public static void main(String[] args) {
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = new String("sachin");

		System.out.println(s1 == s2); // true (both refer same instance)
		System.out.println(s1 == s3); // false (s3 refer to instance created in nonpool)

	}

}
