package List_Interface;

import java.util.*;

import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {

		// Create ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rohan");
		list.add("Navnath");
		list.add("Rohan");
		list.add("Kishor");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
