/* Write a program to assign grades based on marks 
   using the ternary operator. */
import java.util.Scanner;
class Que29{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter marks: ");
      int marks = scanner.nextInt();
      String grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : "C";
      System.out.println("Grade: " + grade);
   }
}