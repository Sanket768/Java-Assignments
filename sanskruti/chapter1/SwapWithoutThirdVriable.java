/* swap two number without using a third variable */
public class SwapWithoutThirdVriable {
    public static void main (String[]args){
        int a = 10 , b = 12 ;
        a = a+b ;
        b = a-b ;
        a = a-b ;
        System . out .println("After swap : a = "+ a  + ", b = " + b);
    }
    
}
