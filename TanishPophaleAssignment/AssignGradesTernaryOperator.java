// Program to assign grades based on the marks obtained

import java.util.Scanner;

public class AssignGradesTernaryOperator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        String grade = (marks>90 && marks<=100) ? "A" : ((marks>80 && marks<=90) ? "B" : ((marks>70 && marks<=80) ? "C" : ((marks<70) ? "E" : "F")));

        System.out.println("The grade obtained on given marks " + marks + " is " + grade);
    }
}
