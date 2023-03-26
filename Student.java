
public class Student {
	int rollno;
	String name;
	String city;
	
	public Student(int rollno,String name,String city)
	{
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	@Override
	public String toString() {
		
		return rollno+" "+name+" "+city;
	}

	public static void main(String[] args)
	{

		Student s1=new Student(101," Rohan","Latur");
		Student s2=new Student(102," Kishor","Pune");
	       
	       System.out.println(s1);
	       System.out.println(s2);

	}

}
