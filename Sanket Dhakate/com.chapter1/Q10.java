/* Demonstrate the type casting (implicit and explicit) 
   between int, float, and double */

public class Q10 {

   public static void main(String[] args) {

      int i = 20;
      float f = i;
      double d = i;

      System.out.println("Implicit Type Casting:");
      System.out.println("Value of i = " + i);
      System.out.println("Value of f = " + f);
      System.out.println("Value of d = " + d);

      System.out.println("Explicit Type Casting:");
      f = 10.99f;
      d = 30.9999;

      i = (int) f;
      f = (float) d;
      System.out.println("Value of i = " + i);
      System.out.println("Value of f = " + f);
   }

}
