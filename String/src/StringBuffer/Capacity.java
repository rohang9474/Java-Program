package StringBuffer;

public class Capacity {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		
	    sb.ensureCapacity(25);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		

	}

}
