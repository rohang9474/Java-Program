package Samsung;

public class String_Methods {

	public static void main(String[] args) {
		String s = "sachin"; // object are created

		// String toUpperCase() & toLowerCase() method
		System.out.println("String toUpperCase() & toLowerCase() method:");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("----------------------------------------");

		// String trim() method
		System.out.println("String trim() method:");
		String s1 = " Rohan  ";
		System.out.println(s1.trim());
		System.out.println("----------------------------------------");

		// String startsWith() & endsWith() method
		System.out.println("String startsWith() & endsWith() method");
		System.out.println(s.startsWith("sa"));
		System.out.println(s.endsWith("n"));
		System.out.println("----------------------------------------");

		// String charAt() method
		System.out.println("String charAt() method");
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		System.out.println("----------------------------------------");

		// String length() method
		System.out.println("String length() method");
		System.out.println(s.length());
		System.out.println("----------------------------------------");

		// String intern() method
		System.out.println("String intern() method");
		String s2 = new String("akash");
		String s3 = s2.intern();
		System.out.println(s3);
		System.out.println("----------------------------------------");

		// String valueOf() method
		System.out.println("String valueOf() method");
		int a = 10;
		String s4 = String.valueOf(a);
		System.out.println(s4 + 10);
		
		int b=500;
		String c=String.valueOf(b);
		System.out.println(c);
		System.out.println("----------------------------------------");
		
		
	}

}
