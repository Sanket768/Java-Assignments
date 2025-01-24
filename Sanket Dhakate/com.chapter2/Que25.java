/* Demonstrate how compound assignment operators 
   work with different data types. */
class Que25{
   public static void main(String[] args) {
      int a = 10;
      int b = 20;
      System.out.println("Before compound assignment:");
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      a += b;  
      b *= a;
      System.out.println("After compound assignment:");
      System.out.println("int a = " + a);
      System.out.println("int b = " + b);

      float i = 10.10f;
      float j = 20.20f;
      System.out.println("Before compound assignment:");
      System.out.println("float i = " + i);
      System.out.println("float j = " + j);
      i += j;  
      j *= i;
      System.out.println("After compound assignment:");
      System.out.println("float i = " + i);
      System.out.println("float j = " + j);
   }
}