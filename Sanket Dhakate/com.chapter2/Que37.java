/* Write a program to find the maximum of three numbers 
   using nested if-else. */
class Que37 {
   public static void main(String[] args) {
      int a = 20;
      int b = 30;
      int c = 40;
      if (a > b) {
         if (a > c) {
            System.out.println("a is the largest number");
         } else if (b > c) {
            System.out.println("b is the largest number");
         } else {
            System.out.println("c is the largest number");
         }
      }
   }
}