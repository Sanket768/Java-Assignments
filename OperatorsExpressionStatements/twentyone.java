/*
 * Demonstrate the use of +=, -=, *=, /=, and %= operators in a program.
 */
class ArithmeticOperators {
    int num1, num2;

    public ArithmeticOperators(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        num1 += num2;
        System.out.println("num1 += num2 : " + num1);
    }

    public void subtract() {
        num1 -= num2;
        System.out.println("num1 -= num2 : " + num1);
    }

    public void multiply() {
        num1 *= num2;
        System.out.println("num1 *= num2 : " + num1);
    }

    public void divide() {
        num1 /= num2;
        System.out.println("num1 /= num2 : " + num1);
    }

    public void modulus(){
        num1 %= num2;
        System.out.println("num1 %= num2 : " + num1);
    }
}

public class twentyone {
    public static void main(String[] args) {
        ArithmeticOperators obj = new ArithmeticOperators(10, 2);
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
        obj.modulus();
    }
}
