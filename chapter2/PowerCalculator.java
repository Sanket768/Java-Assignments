/* write a program to compute the  power of a number using math.pow() and the * operator */
package chapter2;

public class PowerCalculator {
    public static void main(String[]args){
     int num= 2;
     int power = 3;

     int MathPow=(int) Math.pow(num,power);
     System.out.println("MATH POWER :"+ MathPow);

     int usingoperator= num* num* num;
     System.out.println("USING * OPERATOR :"+ usingoperator);
    }
}
