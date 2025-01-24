/* Create an array of Student objects and display their details. */
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Testss {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 20),
            new Student("Bob", 22)
        };

        for (Student student : students) {
            student.display();
        }
    }
}