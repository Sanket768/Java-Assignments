import java.util.Scanner;

class nineteen19 {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();

            int digit = 0;
            int sum = 0;
            while(num!=0){
                digit = num % 10;
                sum = sum+ digit;
                num = num/10;
            }
        System.out.println(sum);
        }
        finally{
            s.close();
        }
    }
}
