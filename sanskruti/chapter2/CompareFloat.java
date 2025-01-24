/* compare two floating -point-numbers and display which one is larger */
package chapter2;

public class CompareFloat {
    public static void main(String[] args){
        float num1= 5.7f;
        float num2= 4.78f;
        if (num1>num2){
            System.out.println(num1 + " is larger.");

        }else if (num1< num2){
            System.out.println(num2 +  " is larger .");
        }else {
            System.out.println(" both numbers are same .");
        }
    }
}
