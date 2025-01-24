import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
}

public class fortytwo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 93));
        students.add(new Student("Bob", 39));
        students.add(new Student("Charlie", 98));

        Collections.sort(students);
        System.out.println("Sorted by marks: ");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getMarks());
        }

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Sorted by name: ");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getMarks());
        }
    }
}
