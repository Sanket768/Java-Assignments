
/* Check the grade of a student based on marks (A, B, C, etc.). */
import java.util.*;

class Student {
    private int marks;

    public Student(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        if (marks >= '9') {
            return "A";
        } else if (marks >= '8') {
            return "B";
        } else if (marks >= '7') {
            return "C";
        } else if (marks >= '6') {
            return "D";
        } else {
            return "F";
        }
    }

}

public class seventh {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println('F');
            int marks = sc.nextInt();
            Student s = new Student(marks);
            System.out.println("Grade of the student is: " + s.getGrade());
        }
    }
}
