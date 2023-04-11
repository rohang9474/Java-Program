package Set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {

		HashSet<String> obj = new HashSet<String>();
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Apple");

		Iterator<String> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
