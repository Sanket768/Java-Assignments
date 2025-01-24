import java.util.Scanner;

class operations{
    private int a;
    private int b;

    
    public void oper(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter first number: ");
            a = s.nextInt();
            System.out.println("Enter second number: ");
            b = s.nextInt();

            System.out.println("Addition of a and b is: " + (a+b));
            System.out.println("Subtraction of a and b is: " + (a-b));
            System.out.println("Multiplication of a and b is: " + (a*b));
            System.out.println("Division of a and b is: " + ((float)a/b));
            System.out.println("Modulus of a and b is: " + ((float)a%b));
        }
        finally{
            s.close();
        }
    }
}

class one {
    public static void main(String[] args) {
        operations o = new operations();
        o.oper();
    }
}
