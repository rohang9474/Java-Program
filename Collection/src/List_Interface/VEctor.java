package List_Interface;

import java.util.Iterator;
import java.util.Vector;

public class VEctor {

	public static void main(String[] args) {

		Vector<String> obj = new Vector<String>();
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Banana");

		Iterator<String> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
