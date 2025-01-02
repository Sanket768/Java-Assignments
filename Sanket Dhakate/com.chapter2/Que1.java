/* 1. Write a program to perform addition, subtraction, 
      multiplication, division, and
      modulus operations on two integers. */
class Que1{

    public static void main(String[] args){
        int a = 990;
        int b = 700;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        float division = (float) a / b;
        int modulus = a % b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
    }
}