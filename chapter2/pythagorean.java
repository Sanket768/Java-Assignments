/* check if the number can form a pythagorean triplet  */
package chapter2;
import java.util.Scanner;
public class pythagorean {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System .out.println(" enter the first number ");
        int a = scanner.nextInt();
        System.out.println(" enter  second number ");
        int b = scanner.nextInt();
        System.out.println(" enter the third number");
        int c = scanner.nextInt();
        if (a>b){
            int temp = a;
            a= b;
            b= temp;
        }
        if(b>c){
            int temp =b; 
            b=c;
            c= temp;
        }
        if ( a*a+b*b ==c*c){
            System.out.println("the number is pythagorean triplet");

        }else{
            System.out.println(" the number is not an pythagorean triplet ");
        }
    }
}
