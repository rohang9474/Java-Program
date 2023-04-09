
public class Pen {
	int prize;
	String color;
	
	public Pen(int prize, String color)
	{
		this.prize=prize;
		this.color=color;
	}
	@Override
	public String toString()
	{
		return "Prize: "+prize +'\n'+
				"Color: "+color;
		
	}
	public static void main(String[] args) {
		Pen s=new Pen(10,"red");
		System.out.println(s);
		

	}

}
