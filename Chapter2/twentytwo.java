import java.util.Scanner;

class twentytwo {
    private static int a;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try{
            System.out.println("Enter the number: ");
            a = s.nextInt();
            
            while(a<=100){
                System.out.println(a);
                a = a+10;
            }

        }
        finally{
            s.close();
        }
    }    
}
    