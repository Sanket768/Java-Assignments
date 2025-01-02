/* Calculate the simple interest using float variables. */

public class Q7 {

    public static void main(String[] args){
        int amount = 1000;
        int time = 5;
        float rate = 13.0f;
        float interest = amount + (float)amount * time * rate /100;
        System.out.println("Simple interest: " + interest);
    }  
}
