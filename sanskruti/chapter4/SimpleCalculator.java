

public class SimpleCalculator {
    



    public int add(int  a, int b) {
        return a + b;
    }

    
    public double subtract(int a, int b) {
        return a - b;
    }

    
    public int  multiply(int  a, int b) {
        return a * b;
    }

    
    public int divide(int  a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error! Division by zero.");
            return 0;
        }
    }

    
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}


