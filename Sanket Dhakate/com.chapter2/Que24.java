/* Write a program to calculate the 
   sum of the first n natural numbers 
   using an assignment operator. */
class Que24{
   public static void main(String[] args) {
      int n = 10;
      int sum = 0;
      for (int i = 1; i <= n; i++) {
         sum += i;
      }
      System.out.println("Sum : " + sum);
   }
}