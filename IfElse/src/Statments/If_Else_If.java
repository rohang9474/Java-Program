package Statments;

public class If_Else_If {

	public static void main(String[] args) {
		int i=00,j=00;
		
		if(i>j) 
		{
			System.out.println(i+" "+"is grater than"+" "+j);
		}
		else if(i<j)
		{
			System.out.println(i+" "+"is less than"+" "+j);
		}
		else if(i!=0 && j!=0 && i==j)
		{
			System.out.println(i+" "+" is Equal to"+" "+j);
		}
		else if(i==j)
		{
			System.out.println("Some thing is wrong");
		}

	}

}
