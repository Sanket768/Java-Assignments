import java.util.Scanner;

class eighteen18 {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();
            int count = 0;

            while(num!=0){
                count++;
                num = num/10;
            }
            System.out.println("The number of digits are: " + count);
        }
        finally{
            s.close();
        }
    }
}
