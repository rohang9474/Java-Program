import java.util.Scanner;
public class Vowel_Remove {

	public static void main(String[] args) 
	{
		String str,rev;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Char here");
		str=scanner.nextLine();
		
		rev=str.replaceAll("[AEIOUaeiou]", "");
		System.out.println("Removed Vowels: "+rev);
	}

}
