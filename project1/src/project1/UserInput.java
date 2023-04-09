package project1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		System.out.println("Name, Age and Salary");
		
		String name= myobj.nextLine();
		int Age=myobj.nextInt();
		double Salary=myobj.nextDouble();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+Age);
		System.out.println("Salary:"+Salary);
	}

}
