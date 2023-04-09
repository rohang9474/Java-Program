package Statments;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=o.nextInt();
		
		 if(a%2==0)
		 {
			 System.out.println(a+" "+"Even Number");
		 }
		
		 else
		 {
			 System.out.println(a+" "+"Odd number");
		 }
    }

}

