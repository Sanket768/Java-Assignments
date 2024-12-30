/* Demonstrate the type casting (implicit and explicit) between int, float, and double */
public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting
        int i = 10;
        float f = i; // implicit type casting from int to float
        System.out.println("Implicit type casting: " + f);

        // Explicit type casting
        double d = 10.5;
        int j = (int) d; // explicit type casting from double to int
        System.out.println("Explicit type casting: " + j);
    }
}
