// Write a program to create a MathOperations class that overloads a method for addition of integers, doubles, and arrays.

import java.util.ArrayList;

class MathOperations{

    public int addInt(int num1, int num2){
        return num1 + num2;
    }

    public double addDouble(double num1, double num2){
        return num1 + num2;
    }

    public ArrayList<Integer> addArrays(ArrayList<Integer> a, ArrayList<Integer> b){
        a.addAll(b);
        return a;
    }


}


public class MathOperationsMain {
    
    public static void main(String[] args) {
        
        MathOperations m = new MathOperations();
        System.out.println("The addition of int number is: " + m.addInt(1,2));

        System.out.println("The addition of two float numbers is: " + 
        m.addDouble(12.232, 12.212));

        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1;i<5;i++){
            a.add(i);
        }

        ArrayList<Integer> b = new ArrayList<>();
        for(int i=5;i<10;i++){
            a.add(i);
        }

        System.out.println("The addition of two integer arrays is: " + m.addArrays(a, b));
    }
}
