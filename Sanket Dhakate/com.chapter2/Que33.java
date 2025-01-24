/* Compute the compound interest for a given principal, 
   rate, and time using expressions. */
class Que33{
   public static void main(String[] args) {
      double amount = 1000;
      double rate = 7.5;
      int time = 5;
      double compoundInterest = amount * Math.pow((1 + rate/100), time);
      System.out.println("Compound Interest: " + compoundInterest);
   }
}