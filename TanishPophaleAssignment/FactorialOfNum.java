// Program to find the factorial of a num

import java.util.Scanner;

public class FactorialOfNum {
  
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = 1;

        while(num!=0){
            fact = fact *num;
            num--;
        }

        System.out.println(fact);
    }
}
