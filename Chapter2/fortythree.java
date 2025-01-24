import java.util.Scanner;

class fortythree {
    private static int n;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            n = s.nextInt();
            while(n!=0){
                System.out.println(n);
                n--;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            s.close();
        }
    }
}
