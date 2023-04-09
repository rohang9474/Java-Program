
public class First {
	
	public static void main(String[] args) 
	{
		try {
			int[] mynumber= {1,2,3};
			System.out.println(mynumber[10]);
			
		} catch (Exception e) {
			System.out.println("Somthing went wrong");
			
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
	}

}
