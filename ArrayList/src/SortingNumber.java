import java.util.ArrayList;
import java.util.Collections;
public class SortingNumber {

	public static void main(String[] args) 
	{
	ArrayList<Integer> obj=new ArrayList<Integer>();
	obj.add(15);
	obj.add(86);
	obj.add(45);
	obj.add(78);
	obj.add(63);
	obj.add(27);
	obj.add(96);
	
	Collections.sort(obj);
	
	/*for(int i:obj)
	System.out.println(i);*/
	
	System.out.println(obj);

	}

}
