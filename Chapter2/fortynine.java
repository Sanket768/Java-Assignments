import java.util.Scanner;

class fortynine {
    private static int num;
    private static boolean isPrime;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            num = s.nextInt();
            isPrime = true;

            if (num < 2) {
                isPrime = false;
            } 
            
            for(int i=2;i<=num-1;i++){
                isPrime = false;
                if(num%i==0){
                    isPrime = false;
                    break;
                }        
            }

            if(isPrime){
                System.out.println("It is a prime number");
            }
            else{
                System.out.println("It is not a prime number");
            }
            
        }
        finally{
            s.close();
        }
    }
}
