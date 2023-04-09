package StringBuffer;

public class Delete {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("my name is rohan");
		System.out.println(sb.length());
		sb.delete(1, 7);
		System.out.println(sb);

	}

}


