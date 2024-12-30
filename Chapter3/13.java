import java.util.Scanner;

class thirteeen {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();

            for(int i=1;i<=10;i++){
                System.out.println( num + " x " + i + " = " + num*i);
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
