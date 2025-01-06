// Create a utility class MathUtils with static methods for common operations like factorial(), power(), etc.

class MathUtils{

    static int factorial(int num){
        int fac = 1;
        while(num!=0){
            fac *= num;
            num--;
        }
        return fac;
    }


    static double power(int num, int pow){
        return Math.pow(num, pow);
    }

}

public class MathUtilsMain {
    
    public static void main(String[] args) {
        
        System.out.println("The factorial is: " + MathUtils.factorial(3));
        System.out.println("The power is: " + MathUtils.power(2, 3));
    }
}
