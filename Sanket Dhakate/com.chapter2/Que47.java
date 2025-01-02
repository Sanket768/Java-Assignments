/* Implement a program to check if a number is a palindrome 
   using loops and expressions. */
class Que47{
   public static void main(String[] args) {
      int num = 121;
      int palindrome = 0;
      int temp  = num;
      while (temp != 0){
         int digit  = temp % 10;
         palindrome = palindrome * 10 + digit;
         temp /= 10;
      }

      if(num == palindrome){
         System.out.println("Number is palindrome");
      }
      else{
         System.out.println("Number is not palindrome");
      }


   }
}