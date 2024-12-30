/* determine if three side from a valid triangle using the triangle ineqality theorem */
package chapter2;
import java.util.Scanner;
public class Triangle {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println(" enter the first side of triangle :");
        double a = scanner.nextDouble();
        System.out.println( " enter the second side of triangle:");
        double b = scanner.nextDouble();
        System.out.println(" enter the third side of triangle:");
        double c = scanner.nextDouble();
        if (( a+b>c)&&( a+c>b)&&( b+c >a)){
            System.out.println(" the sides from valid triangle");
        }else{
            System.out.println(" the side do not from a valid triangle");
        }

        }
        
    }
    

