// Program to print the numbers from 1 to 50 skipping divisble by 3 and 5.

import java.util.Scanner;

public class PrintNumNotDivBy3And5 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 50; i++) {
            if(i%3!=0 && i%5!=0){
                System.out.println("The number is: " + i);
            }
        }
    }
}
