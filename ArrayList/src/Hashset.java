import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) 
	{
		HashSet<String> obj=new HashSet<String>();
		obj.add("Audi");
		obj.add("BMW");
		obj.add("Hondai");
		obj.add("Ford");
		obj.add("BMW");
		
	   Iterator<String>it= obj.iterator();
	   
		//Print the first item
		System.out.println(it.next());
	
		

	}
	}
