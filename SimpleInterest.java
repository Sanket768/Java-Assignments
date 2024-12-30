/* calculate simple interest using float variable */
public class SimpleInterest {
    public static void main(String[]args){
        float  principle = 10000 ,rate = 5 , time = 3;
        float  SimpleInterest = ( principle * rate * time)/100;
        System.out.println("SIMPLE INTEREST:"+ SimpleInterest);
    }
}
