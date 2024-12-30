/* Write a program to assign grades based on marks using the ternary operator */
package chapter2;
import java.util.Scanner;
public class AssignGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        String grade = (marks >= 90) ? "A" :
                       (marks >= 80) ? "B" :
                       (marks >= 70) ? "C" :
                       (marks >= 60) ? "D" : "F";

        System.out.println("Grade: " + grade);
    }
}
