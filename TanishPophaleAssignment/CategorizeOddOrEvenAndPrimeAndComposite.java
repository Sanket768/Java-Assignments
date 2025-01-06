// Program to find whether the given number is odd or even and prime or composite

import java.util.Scanner;

public class CategorizeOddOrEvenAndPrimeAndComposite {
    
    public static bool oddEven(int num){

        boolean isEven;
        
        if(num%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }


    public static bool PrimeComposite(int num){
          int flag = 0;

          for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                flag = 1;
                break; 
            }
          }

          if()
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int isPrime = PrimeComposite(num);
        String OddEven = oddEven(num);

        if(isPrime==0 && OddEven=="Even"){
            System.out.println("The number " + num + " is both prime " );
        }
    }
}
