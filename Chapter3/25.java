import java.util.Scanner;

class twentyfive25 {
    private static int num=10;
    private static int guess;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            do{
                System.out.println("Guess the number: ");
                guess = s.nextInt();
                if(guess!=num){
                    System.out.println("Incorrect");
                }
            }
            while(num!=guess);
            if(num == guess){
                System.out.println("Correct");
            }
        }
        finally{
            s.close();
        }
    }
}
