/* Write a program to create a MathOperations class that overloads a method for addition of integers, doubles, and arrays. */
class MathOperations {
    private int num1, num2;
    private double num3, num4;
    private int[] arr1, arr2;

    public MathOperations(int n1, int n2, double d1, double d2, int[] a1, int[] a2) {
        num1 = n1;
        num2 = n2;
        num3 = d1;
        num4 = d2;
        arr1 = a1;
        arr2 = a2;
    }

    public int addInteger() {
        return num1 + num2;
    }

    public double addDouble() {
        return num3 + num4;
    }

    public int[] addArray() {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }
}

public class fifteen {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        double num3 = 10.5, num4 = 20.5;
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        MathOperations math = new MathOperations(num1, num2, num3, num4, arr1, arr2);
        System.out.println("Addition of integers: " + math.addInteger());
        System.out.println("Addition of doubles: " + math.addDouble());
        System.out.print("Addition of Arrays: ");
        for (int i : math.addArray()) {
            System.out.print(i + " ");
            }
            System.out.println();
    }
}
