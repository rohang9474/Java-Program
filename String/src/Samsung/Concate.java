package Samsung;

public class Concate {
	
	// two ways to concate

	public static void main(String[] args) 
	{
		// using + operator
		String s1="sachin "+"tendulkar";
		System.out.println(s1);
		
		// using concat() method
		String s2="Rohan ";
		String s3="Ghodke";
		String s4= s2.concat(s3);
		System.out.println(s4);
		
		String s=s2.concat(s3);
		System.out.println(s);

	}

}
