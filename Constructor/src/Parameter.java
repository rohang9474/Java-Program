
public class Parameter {
	int empid;
	String name;
	double salary;
	
	public Parameter()
	{
		empid=0;
		name= null;
		salary=0;
	}
	
	public Parameter(int empid, String name, double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	
    public void display()
    {
    	System.out.println("Employe id :"+empid);
    	System.out.println("Employe name :"+name);
    	System.out.println("Employe salary :"+salary);
    }
	public static void main(String[] args) 
	{
		Parameter obj1=new Parameter();
		Parameter obj2=new Parameter(102,"Kunal",20000);

		obj1.display();
		obj2.display();
		

	}

}
