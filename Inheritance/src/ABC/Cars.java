package ABC;

class Cars extends Vehicle {
	private String modelName = "Mustang";
	
public static void main(String[] args) 
{
   Cars myobj=new Cars();
   myobj.honk();
   System.out.println(myobj.brand+" "+ myobj.modelName);
   

}

}
