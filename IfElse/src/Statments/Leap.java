package Statments;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) 
	
	{
		Scanner y=new Scanner(System.in);
		System.out.println("Enter Year here...");
		 int a=y.nextInt();
		 
		 if(a%4==0)
		 {
			 System.out.println(a+" "+"is leap year");
		 }
		 else
		 {
			 System.out.println(a+" "+"is not leap year");
		 }

	}

}
