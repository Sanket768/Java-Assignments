// Program to implement ithe explicit and implicit convertion of data types 


public class ImplicitExplicitDataTypeconvertion {
    
    public static void main(String[] args){

        // Implicit Data Type Conversions
        int a = 50;
        System.out.println("The value of integer type variable a is: " + a);

        double b = a;
        System.out.println("The value of double type variable is: " + b);

        int c = 90;
        System.out.println("The value of float type variable c is: " + c );

        float d = c;
        System.out.println("The value of float type variable d is: " + d);

        char e = 'a';
        System.out.println("The value of char type variable e is: " + e);

        int f = e;
        System.out.println("THe value of integer type variable f is: " + f);
       
       
        // Explicit Type Convertions
        float g = 15.03f;
        System.out.println("THe value of float type variable g is: " + g);

        int h = (int)g;
        System.out.println("The value of inteer type variable h is: " + h);

        int i = 68;
        System.out.println("The value of integer variable i is: " + i);

        char j = (char)i;
        System.out.println("The value of char variable j is: " + j);

    }
}
