package Samsung;

public class Second {

	public static void main(String[] args) {
		String s = "Rohan "; // object is created
		s.concat("Ghodke"); // once obj is created its not change
		System.out.println(s);

		String s1 = "Welcome "; // object is created
		s1 = s1.concat("Home"); // its not change but another add it.
		System.out.println(s1);

	}

}
