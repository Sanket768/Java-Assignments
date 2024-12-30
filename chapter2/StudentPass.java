/* write a program to check if a student has passed based on marks using comparator operator */
package chapter2;
import java.util.Scanner;
public class StudentPass {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System .out .println("enter the marks  of student ");
        int marks = scanner.nextInt();
        int passedmarks = 40;
        if (marks >= passedmarks){
            System.out.println( " the student has passed");
        }else{
            System.out.println("  the student has  failed ");
        }

    }
}
