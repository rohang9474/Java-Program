
public class OverLoading {
	
	public static void animal(String name)     // method 1
	{
		System.out.println("Animal name :"+name);
	}
	public static void animal(double prise)    // method 2
	{
		System.out.println("Animal prise :"+prise);
	}
	public static void animal(int legs)        // method 3
	{
	   System.out.println("Animal legs :"+legs);	
	}

	public static void main(String[] args) 
	{
		animal("mani");
		
		double prise=15000;
		animal(prise);
		
		animal(4);
	
	}

}
