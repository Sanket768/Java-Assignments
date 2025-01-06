import java.util.Scanner;

public class AssignmentOperators {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Enter another number to perform the addition operations: ");
        int num2 = sc.nextInt();

        num+=num2;
        System.out.println("The addition equal to assignment is: " + num);

        System.out.println("Enter another number to perform the substract equal operations: ");

        int num3 = sc.nextInt();
        num-=num3;

        System.out.println("The substraction equal to assignment is: " + num);

        System.out.println("Enter another number to perform the multiplication operations: ");

        int num4 = sc.nextInt();
        num*=num4;

        System.out.println("The multiplication equal to assignment is: " + num);

        System.out.println("Enter another number to perform the division operations: ");
        
        int num5 = sc.nextInt();
        num5/=num;
        
        System.out.println("The division equal to assignment is: " + num);


        System.out.println("Enter another number to perform the modulo operations: ");

        int num6 = sc.nextInt();
        num6%=num;

        System.out.println("The modulo equal to assignment is: " + num);

    }
}
