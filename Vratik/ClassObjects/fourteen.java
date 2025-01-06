/*
 * Create a parent class Person with a method display(). Use super to call it in the 
child class Student.
 */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Student extends Person {
    private String rollNo;

    public Student(String name, int age, String rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
    }
}

public class fourteen {
    public static void main(String[] args) {
        Student s = new Student("John", 20, "S101");
        s.display();
    }
}
