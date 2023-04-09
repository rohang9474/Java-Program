package Extends;

public class Dog extends Animal {
	String color;

	public Dog(String name, String sound, int legs, String color) {
		super(name, sound, legs);
		this.color = color;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("My color is :" + color);
	}

	@Override
	public String toString() {
		return name + " " + sound + " " + legs + " " + color;
	}

}
