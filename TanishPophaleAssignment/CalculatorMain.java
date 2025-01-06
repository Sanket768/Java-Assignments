//  Create a Calculator class with methods for addition, subtraction, multiplication, and division.

class Calculator{

    private int num1;
    private int num2;
    

    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2= num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add(){
        return num1 + num2;
    }

    public int sub(){
        if(num1 > num2){
            return num1-num2;
        }
        else{
            return -(num2 - num1);
        }
    }

    public int multiply(){
        return num1*num2;
    }

    public double div(){
        return num1/num2;
    }

}

public class CalculatorMain {
    

    public static void main(String[] args) {
        
        Calculator c1 = new Calculator(12, 12);
        System.out.println("The addition of two numbers " + c1.getNum1() + " and " + c1.getNum2() + " is " + c1.add());

        System.out.println("The substraction of two numbers " + c1.getNum1() + " and " + c1.getNum2() + " is " + c1.sub());

        System.out.println("The multiplication of two numbers " + c1.getNum1() + " and " + c1.getNum2() + " is " + c1.multiply());

        System.out.println("The division of two numbers " + c1.getNum1() + " and " + c1.getNum2() + " is " + c1.div());
    }
}
