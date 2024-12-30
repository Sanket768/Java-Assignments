import java.util.Scanner;

class fortysix {
    private static int a;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            a = s.nextInt();

            if(a%2==0 && a%3==0 && a%5==0){
                System.out.println("THe number is a multiple of 2,3 and 5");
            }
            else{
                System.out.println("The number is not a multiple of 2,3 and 5");
            }
        }
        finally{
            s.close();
        }
    }
}
