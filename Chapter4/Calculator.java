import java.util.Scanner;

class Calculate {
    private double num1;
    private double num2;
    public void setData(){
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter first number: ");
            num1 = s.nextDouble();

            System.out.println("Enter Second number: ");
            num2 = s.nextDouble();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void add(){
        double add = num1 + num2;
        System.out.println("Addition: " + add);
    }

    public void sub(){
        double sub = num1 - num2;
        System.out.println("Subtraction: " + sub);
    }

    public void mul(){
        double mul = num1 * num2;
        System.out.println("Multiplication: " + mul);
    }

    public void div(){
        double div = num1 / num2;
        System.out.println("Division: " + div);
    }

    public void mod(){
        double mod = num1%num2;
        System.out.println("Mod: " + mod);
    }
}

class Calculator {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.setData();
        c.add();
        c.sub();
        c.mul();
        c.div();
        c.mod();
    }
}
