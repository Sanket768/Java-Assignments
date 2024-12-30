import java.util.Scanner;

class thirtyeight38 {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            num = s.nextInt();
            int sum = 0;
            for(int i=1;i<=num/2;i++){
                if(num%i==0){
                    sum = sum+i;
                }
            }
            if(sum == num){
                System.out.println("It is a perfect number");
            }
            else{
                System.out.println("It is not a perfect number");
            }
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            s.close();
        }
    }
}
