import java.util.Scanner;

class fifteen15 {
    private static int n;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            n = s.nextInt();

            int f1=0;
            int f2=1;
            int f3;
            System.out.println(f1);
            System.out.println(f2);

            for(int i=2;i<=n;i++){
                f3 = f1 + f2;
                System.out.println(f3);
                f1=f2;
                f2=f3;
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
