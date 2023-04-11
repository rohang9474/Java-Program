package Map_Interface;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		obj.put(1, "Apple");
		obj.put(1, "Mango");
		obj.put(3, "Apple");
		obj.put(2, "Banana");

		for (Entry<Integer, String> m : obj.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
