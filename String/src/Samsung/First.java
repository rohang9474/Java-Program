package Samsung;

public class First {

	public static void main(String[] args) 
	{
		// By using String literal
		String s1 = "By using String literal";
		
		// Convert Array to String
		char ch[] = { 'R', 'o', 'h', 'a', 'n' };
		String s2 = new String(ch);
		
		// By using String keyword
		String s3 = new String("By using String keyword");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
