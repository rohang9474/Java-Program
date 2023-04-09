public class Person {
    private String name;
    private int age;
    
    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }
    
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        p1.display();
        
        // Using parameterized constructor
        Person p2 = new Person("John Doe", 30);
        p2.display();
    }
}
