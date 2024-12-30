import java.util.Scanner;

class divisibilitytest {
    private int num;

    public void checkdev(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter number: ");
            num = s.nextInt();

            if((num%3==0) && (num%5==0)){
                System.out.println("The number is divisible by both 3 and 5");
            }
            else{
                System.out.println("The number is not divisible by both 3 and 5");
            }
        }
        finally
        {s.close();}
    }
}

class eleven {
    public static void main(String[] args) {
        divisibilitytest d = new divisibilitytest();
        d.checkdev();
    }
}
