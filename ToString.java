
public class ToString {
	int rollno;
	String name;
	String city;
	
	public ToString(int rollno,String name,String city)
	{
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	
	public String toString()
	{
		return rollno+" "+name+" "+city;
		
	}

	public static void main(String[] args) 
	{	
       ToString s1=new ToString(101,"Rohan","Latur");
       ToString s2=new ToString(102,"Kishor","Pune");
       
       System.out.println(s1);
       System.out.println(s2);
	}

}
