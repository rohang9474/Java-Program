package Statments;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) 
	{
		Scanner mk=new Scanner(System.in);
		System.out.println("Enter mark here...");
		int a=mk.nextInt();
		
		if(a<40)
		{
			System.out.println("failed");
		}
		else if(a>=40 && a<50)
		{
			System.out.println("D grade");
		}
		else if(a>=50 && a<60)
		{
			System.out.println("C grade");
		}
		else if(a>=60 && a<70)
		{
			System.out.println("B grade");
		}
		else if(a>=70 && a<80)
		{
			System.out.println("B+ grade");
		}
		else if(a>=80 && a<90)
		{
			System.out.println("A grade");
		}
		else if(a>=90 && a<=100)
		{
			System.out.println("A+ grade");
		}
		else
		{
			System.out.println("Invalid Mark's");
		}
		

	}

}
