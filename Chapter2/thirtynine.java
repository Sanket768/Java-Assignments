import java.util.Scanner;

class thirtynine {
    private static int num;
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            try{
                System.out.println("Enter a number: ");
                num = s.nextInt();
                while(num!=0){
                    int a = num % 10;
                    num = num/10;
                    System.out.print(a);
                }
                System.out.println();
            }
            finally{
                    s.close();
            }
    }
}
