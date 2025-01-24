import java.util.Scanner;

class average {
    private double a;
    private double b;
    private double c;
    private double avg;

    public void avg(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the value of a: ");
            a = s.nextDouble();
            System.out.println("Enter the value of b: ");
            b = s.nextDouble();
            System.out.println("Enter the value of c: ");
            c = s.nextDouble();

            avg = (a + b + c)/3;
            System.out.println("Average: " + avg);
        }
        finally{
            s.close();
        }
    }
}

class two {
    public static void main(String[] args) {
        average a = new average();
        a.avg();
    }
}
