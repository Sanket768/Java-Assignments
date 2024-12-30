import java.util.Scanner;

class one {
    private static int number;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            number = s.nextInt();

            if(number>0){
                System.out.println("Positive");
            }
            else if(number<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }
        finally{
            s.close();
        }
    }
}