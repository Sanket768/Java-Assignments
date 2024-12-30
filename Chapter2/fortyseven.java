import java.util.Scanner;

class fortyseven {
    private static int num;
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            try{
                System.out.println("Enter a number: ");
                num = s.nextInt();
                int rev = 0;
                int temp = num;
                while(temp!=0){
                    int a = temp % 10;
                    rev = rev * 10 + a;
                    temp = temp/10;                    
                }
                if(num == rev){
                    System.out.println("It is Palindrome number");
                }
                else{
                    System.out.println("It is not a Palindrome number");
                }
            }
            finally{
                    s.close();
            }
    }
}
