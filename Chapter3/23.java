import java.util.Scanner;

class twentythree23 {
    private static int num;
    private static int power;
    private static int answer = 1;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();
            System.out.println("Enter the power: ");
            power = s.nextInt();

            int i = 1;
            do{
                answer = answer * num;
                i++;
            }
            while(i<=power);
            System.out.println(answer);
        }
        finally{
            s.close();
        }
    }
}
