import java.util.Scanner;

class two {
    private static int num1;
    private static int num2;
    private static int num3;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num1 = s.nextInt();
            System.out.println("Enter the number: ");
            num2 = s.nextInt();
            System.out.println("Enter the number: ");
            num3 = s.nextInt();

            if(num1>num2){
                if(num1>num3){
                    System.out.println("Num1 is largest");
                }
                else{
                    System.out.println("Num3 is largest");
                }
            }
            if(num2>num1){
                if(num2>num3){
                    System.out.println("Num2 is largest");
                }
                else{
                    System.out.println("Num3 is largest");
                }
            }
            if(num3>num1){
                if(num3>num1){
                    System.out.println("Num3 is largest");
                }
                else{
                    System.out.println("Num2 is largest");
                }
            }
            
        }
        finally{
            s.close();
        }
    }
}
