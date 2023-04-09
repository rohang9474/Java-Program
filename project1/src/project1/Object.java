package project1;

public class Object {
	String fname;
	String lname;
	
	public Object()
	{
		fname=null;
		lname=null;
	}
	public Object(String fn, String ln)
	{
		fname=fn;
		lname=ln;
	}
	
	
	public static void main(String[]args)
	{
	Object obj= new Object("Rohan","Ghodke");
	System.out.println(obj.fname+ " "+ obj.lname);



	}
}


