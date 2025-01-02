/*
 * Write a program to assign grades based on marks using the ternary operator.
 */
import java.util.Scanner;
class Marks {
    private int marks;

    public Marks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return (marks >= 90) ? "A" : (marks >= 80) ? "B" : (marks >= 70) ? "C" : (marks >= 60) ? "D" : "F";
    }
}

public class twentynine {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter marks:");
            int marks = sc.nextInt();
            Marks m = new Marks(marks);
            System.out.println("Grade: " + m.getGrade());
        }
    }
}
