/* Demonstrate the difference between pre-increment 
   and post-increment operators. */
class Que41{
   public static void main(String[] args) {
      int x = 10;
      System.out.println("Value: " + x);
      System.out.println("Pre-increment: " + ++x);
      System.out.println("Post-increment: " + x++);
      System.err.println("Value: " + x);
   }
}