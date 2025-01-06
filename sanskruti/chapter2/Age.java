/* validate user input  using logical condition(age > 0 and  age <150) */
package chapter2;
import java.util.Scanner;
public class Age {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the age :");
        int age = scanner.nextInt();
        if(age>0 && age < 150){
            System.out.println(" valid age entered: "+age);
        }else{
            System.out.println(" invalid age ");
        }

    
    }
}
