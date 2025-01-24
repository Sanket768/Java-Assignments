/* Create a School class to manage a list of students using ArrayList. */
import java.util.ArrayList;

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

class School {
    private ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }
}

public class TestSchool {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("Alice", 20));
        school.addStudent(new Student("Bob", 22));
        school.displayStudents();
    }
}
