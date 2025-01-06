// Program to print numbers from 1 to 10but use continue when it is equal to 5.

public class PrintNumUsingContinue {
    
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            else{
                System.out.println("The value of number is " + i );
            }
        }
    }
}
