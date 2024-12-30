import java.util.Scanner;

class thirtysix {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the num: ");
            num = s.nextInt();

            if(num%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
        }
        finally{
            s.close();
        }
    }
}
