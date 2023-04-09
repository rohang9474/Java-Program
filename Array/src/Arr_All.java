
public class Arr_All {
	public static void main(String[] args)
	{
		// create an Arrays
		int arr[];
		
		//initialize size of array
		arr= new int[5];
		
		// Add 1st element of Array
		arr[0]=10;
		
		//next initialize the elements
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		/*for(int i:arr)
		{
			System.out.println(i);
		}*/
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element of index "+i+": "+ arr[i]);
		}
		
	}
}