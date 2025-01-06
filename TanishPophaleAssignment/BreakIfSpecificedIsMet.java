// Program to count throughout the loop till 50(i.e specified limit) and if specific condition is met, it should break.

public class BreakIfSpecificedIsMet {
    
    public static void main(String[] args) {
        
        int i=1;
        int count = 0;

        while(i<=50){
            if(i==25){
                break;
            }
            count++;
        }

        System.out.println("The count is: " + count);
    }
}
