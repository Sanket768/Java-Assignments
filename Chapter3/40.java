import java.util.Scanner;

class forty40 {
    private static int num=10;
    private static int guess;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int count=0;
            boolean guessed = false;
            while(count<3){
                System.out.println("Guess the number(1-10): ");
                guess = s.nextInt();

                if(guess == num){
                    System.out.println("Correct guess");
                    break;
                }
                else {
                    System.out.println("Incorrect guess. Try again.");
                }
                count++;
            }
            if(!guessed){
                System.out.println("Attempts limit reached");
            }
        }
        finally{
            s.close();
        }
    }
}
