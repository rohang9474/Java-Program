
public class Concat {

	public static void main(String[] args) 
	{
		String s="Rohan"+" Ghodke";
		System.out.println("By using '+' operators:");
		System.out.println(s);
		
	    System.out.println();
	
		String s1="Rohan";
		String s2=new String(" Ghodke");
		String s3= s1.concat(s2);
		
		System.out.println("By using concat() method");
		System.out.println(s3);

	}

}
