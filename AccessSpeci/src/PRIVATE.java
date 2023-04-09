
public class PRIVATE {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) 
	{
		PRIVATE o=new PRIVATE();
		o.setName("cool");
		System.out.println(o.getName());

	}

}
