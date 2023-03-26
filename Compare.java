
public class Compare {

	public static void main(String[] args) 
	{
		String s1="Rohan";
		String s2="Rohan";
		String s3=new String("Rohan");
		String s4="Ghodke";
		
		System.out.println("using equals() method.");
		System.out.println(s1.equals(s2));
	    System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println("Using == Operator.");
	    System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		System.out.println("using CompareTo() method.");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));

	}

}
