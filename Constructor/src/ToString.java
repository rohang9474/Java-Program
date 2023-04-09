
public class ToString {
	int empid;
	String name;
	double salary;

	
	public ToString(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empid =" + empid +'\n'+
				"Name =" + name + '\n'+
				"Salary ="+ salary;
	}

	public static void main(String[] args) 
	{
		ToString obj=new ToString(10,"Rohan",50000);
		System.out.println(obj);
				
		

	}

}
