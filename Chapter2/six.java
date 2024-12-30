import java.util.Scanner;

class check {
    private double a;
    private double b;

    public void checknum(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter first number: ");
            a = s.nextDouble();
            System.out.println("Enter second number: ");
            b = s.nextDouble();

            if(a > b){
                System.out.println( a + " is greater than " + b );
            }
            else if(a == b){
                System.out.println( a + " is equal to " + b );
            }
            else{
                System.out.println( a + " is lesser then " + b);
            }
        }
        finally{
            s.close();
        }

    }
}

class six {
    public static void main(String[] args) {
        check c = new check();
        c.checknum();
    }    
}
