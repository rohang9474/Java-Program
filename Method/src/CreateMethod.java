
public class CreateMethod {
	
	// use static keyword, we don't need to create obj to call method
   public static void printName(String name)
   {
	   System.out.println("Hi, I am "+name);
   }
   
   // use void keyword, create obj to call method
   public void printName(int age)
   {
	   System.out.println("My age is "+age);
   }
   
  public static void main(String[]args)
  {
	  //call method without creating obj.
	  String name= "Mary";
	  printName(name);
	  
	  //call method using create a obj.
	  CreateMethod obj=new CreateMethod();
	  obj.printName(45);
      
  }
}
