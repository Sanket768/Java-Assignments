import java.util.Scanner;

class seventeen17 {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();
            int remainder=0;
            int reverse=0;
            int temp = num;
            while(temp!=0){
                remainder = temp%10;
                reverse = reverse*10 + remainder;
                temp = temp/10;
            }
            if(num == reverse){
                System.out.println("It is a palindrome number");
            }
            else{
                System.out.println("It is not a palindrome number");
            }
        }
        finally{
            s.close();
        }
    }
}
