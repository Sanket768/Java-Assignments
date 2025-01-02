/* Write a program to find the largest of three numbers 
   using the ternary operator. */
class Que26{
   public static void main(String[] args) {
      int a = 10;
      int b = 20;
      int c = 30;
      System.out.println("a : "+ a + " b : "+ b + " c : "+ c);
      String largest = (a > b && a > c) ? "a" : (b > c) ? "b" : "c";
      System.out.println(largest);
   }
}