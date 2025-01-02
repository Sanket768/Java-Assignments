/* Determine if a person is eligible for senior citizen 
   benefits based on age using the ternary operator. */
class Que28{
   public static void main(String[] args) {
      int age = 60;
      String senior = (age >= 60) ? "Eligible for senior citizen benefits" : "Not eligible for senior citizen benefits";
      System.out.println(senior);
   }
}