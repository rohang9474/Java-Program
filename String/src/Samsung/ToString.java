package Samsung;

public class ToString {

	String name;
	int age;
	String add;

	public ToString(String name, int age, String add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Name: " + name + '\n' + "Age: " + age + '\n' + "Address: " + add;

	}

	public static void main(String[] args) {
		ToString s1 = new ToString("Rohan Ghodke", 25, "Latur");
		System.out.println(s1);

	}

}
