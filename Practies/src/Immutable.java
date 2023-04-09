
public class Immutable {

	public static void main(String[] args) {
		Integer[] mynumber= {1,2,3};
		mynumber[0]=2;
		
		for(int i=0;i<mynumber.length; i++)
		{
			System.out.println(mynumber[i]);
		}
		

	}

}
