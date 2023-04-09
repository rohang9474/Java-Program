package Samsung;

public class Replace {

	public static void main(String[] args) 
	{
		String s="java is a lang, java is platform, java is easy ";
		
           //Java String replace() Method
		System.out.println("String replace() Method");
		String replacestr= s.replace("java", "mava");
		String str=s.replace("is", "an");
		
		System.out.println("Original String: "+s);
		System.out.println("Replace String: " +replacestr);
		System.out.println(str);
		
		
	}

}
