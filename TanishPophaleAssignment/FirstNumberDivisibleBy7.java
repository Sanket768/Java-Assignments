// Program to find first num divisible by 7 using break statement.

public class FirstNumberDivisibleBy7 {
    
    public static void main(String[] args) {
        
        for(int i=1; true; i++){
            if(i%7==0){
                System.out.println("The first number divisible by 7 is: " + i);
                break;
            }
        }


    }
}
