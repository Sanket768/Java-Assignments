import java.util.Scanner;

class forteen14 {
    private static int num;
    private static int factorial=1;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();
            
            for(int i =num;i>0;i--){
                factorial = factorial*i;
            }
            System.out.println(factorial);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            s.close();
        }
    }
}
