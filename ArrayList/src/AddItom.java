
import java.util.ArrayList;
import java.util.Iterator;

public class AddItom 
{
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Rohan");
		obj.add("Kishor");
		obj.add("Navnath");
		obj.add("Rohit");
		
		//System.out.println(obj);           //Show all
		 
		//System.out.println(obj.get(3));   //Access an Itom-vai index
		
		/*obj.set(0, "ghodke");
		System.out.println(obj);*/         //Change an Itom 
		
		/*obj.remove(0);
		System.out.println(obj);*/        // Remove an Itom
		
		/*obj.clear();
		System.out.println(obj);*/       // Remove All
		
	Iterator<String>itr=obj.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());

	}

}
