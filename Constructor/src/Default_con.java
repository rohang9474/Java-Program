
public class Default_con {
	int age;
	String name;
	
	public Default_con()
	{
		age=0;
		name=null;
	}
	
	public void display()
	{
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) 
	{
		Default_con obj=new Default_con();
		System.out.println("Default constructor");
		obj.display();	
		
		
	}
}