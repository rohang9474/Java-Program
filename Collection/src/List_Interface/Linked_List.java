package List_Interface;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> str = new LinkedList<String>();
		str.add("Rohan");
		str.add("navnath");
		str.add("Rohan");
		str.add("Kishor");
		System.out.println("Array: " + str);

		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
