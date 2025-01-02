/* Write a Person class with a default constructor that initializes default values. */
public class Person {
    String name;
    int age;

    public Person() {
        name = "Default Name";
        age = 0;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
