import java.util.Scanner;

class fortyone41 {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();
            boolean isPrime=true;

            if (num < 2) {
                isPrime = false;
            }

            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("It is a prime number");
            }
            else{
                System.out.println("It is not a prime number");
            }

            if(num%2==0){
                System.out.println("It is an even number");
            }
            else{
                System.out.println("It is an odd number");
            }
        }
        finally{
            s.close();
        }
    }
}
