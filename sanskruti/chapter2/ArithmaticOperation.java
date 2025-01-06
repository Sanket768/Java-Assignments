/* write a program  to perform  addition ,subtraction , multiplication, division, modulus operation of two numbers   */
package chapter2;

public class ArithmaticOperation {
    public static void main(String[] args){
        int num1= 10;
        int num2=  15;
        int addition = num1+ num2 ;
        int subtraction = num1-num2;
        int multiplication = num1 * num2;
        int division = num1/num2;
        int modulus = num1 % num2;

        System.out.println("addition:"+ addition);
        System.out.println("subtraction:" +subtraction);
        System.out.println("multiplication:"+multiplication);
        System.out.println("division:"+division);
        System.out.println("modulus:"+modulus);

    }
    
}
