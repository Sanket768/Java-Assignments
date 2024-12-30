import java.util.Scanner;

class sixteen16 {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();

            int remainder = 0;
            int reverse = 0;

            while(num!=0){
                remainder = num%10;
                reverse = reverse*10 + remainder;
                num = num/10;
            }
            System.out.println(reverse);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            s.close();
        }
    }
}
