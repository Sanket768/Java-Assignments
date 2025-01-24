/* Write a program to check if a number is prime 
   using a loop and conditional statements. */
class Que49{
   public static void main(String[] args) {
      int num = 7;
      boolean prime = true;

      if (num == 1){
         prime = false;
      }
      for (int i = 2; i < num; i++){
         if(num % i == 0){
            prime = false;
            break;
         }
      }

      if(prime== true){
         System.out.println(num + " is a prime number");
      }
      else{
         System.out.println(num + " is not a prime number");
      }
   }
}