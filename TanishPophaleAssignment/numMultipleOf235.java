// Program to check whether a no is multiple of 2, 3 and 5

import java.util.Scanner;

public class numMultipleOf235 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The number " + num + " is multiple of 2.");
        }
        else if(num%3==0){
            System.out.println("The number " + num + " is multiple of 3");
        }
        else{
            System.out.println("The number " + num + " is a multiple of 5.");
        }
    }
}
