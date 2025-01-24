import java.util.Scanner;

class calculate {
    private int a;
    private int b;
    private char oper;

    public void operation(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the first number: ");
            a = s.nextInt();
            System.out.println("Enter the second number: ");
            b = s.nextInt();
            System.out.println("Enter the operation(+,-,/,%): ");
            oper = s.next().charAt(0);

            switch (oper) {
                case '+':
                    System.out.println(a+b);
                    break;

                case '-':
                    System.out.println(a-b);
                    break;

                case '/':
                    System.out.println(a/b);
                    break;

                case '%':
                    System.out.println(a%b);
                    break;
            
                default:
                    break;
            }

        }
        finally{
            s.close();
        }
    }

}

class calc {
    public static void main(String[] args) {
        calculate c = new calculate();
        c.operation();
    }
}
