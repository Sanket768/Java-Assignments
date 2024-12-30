import java.util.Scanner;

class power {
    private int n;
    private int p;

    public void pow(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            n = s.nextInt();
            System.out.println("Enter the power: ");
            p = s.nextInt();

            System.out.println("Power of " + n + " to " + p + " is " + (Math.pow(n, p)));
        }
        finally{
            s.close();
        }
    }
}

class three {
    public static void main(String[] args) {
        power p = new power();
        p.pow();
    }   
}
