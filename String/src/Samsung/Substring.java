package Samsung;

public class Substring {

	public static void main(String[] args) {
		String s = "Rohan Ghodke";
		System.out.println("length of index: " + s.length());

		System.out.println("Orignal String is: " + s);
		System.out.println("index start from 6: " + s.substring(6));
		System.out.println("Substring starting from index 0 to 4: " + s.substring(0, 5));
		
		String p="hello";
		System.out.println(p.substring(2));
		System.out.println(p.substring(0, 2));

	}

}
