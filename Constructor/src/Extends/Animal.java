package Extends;

public class Animal {
	String name;
	String sound;
	int legs;

	public Animal(String name, String sound, int legs) {
		this.name = name;
		this.sound = sound;
		this.legs = legs;
	}

	public void display() {
		System.out.println("My name is :" + name);
		System.out.println("My sound is :" + sound);
		System.out.println("My no of legs is :" + legs);
	}

}
