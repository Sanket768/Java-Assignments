/*
 * Overload methods for add() to accept different numbers and types of arguments (int, 
double, etc.).
 */
class addNumbers{
    public void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    public void add(double num1, double num2){
        System.out.println(num1+num2);
    }
    public void add(float num1, float num2){
        System.out.println(num1+num2);
    }
}
public class twelve{
    public static void main(String[] args) {
        addNumbers add = new addNumbers();
        add.add(4,4);
        add.add(4.32, 4.56);
        add.add(4.242,5.6123);
    }
}