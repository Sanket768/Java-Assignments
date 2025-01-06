import java.util.Scanner;

public class FactorialUsingRecurrsion {
    
    public static int fac(int num){

        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }

        return num*fac(num-1);
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int factorial = fac(num);
        System.out.println("The factorial of number " + num + " is " + factorial );


    }
}
