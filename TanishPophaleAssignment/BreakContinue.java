// Program to execute break and continue

public class BreakContinue {
    
    public static void main(String[] args) {
        
        // break
        int i=0;
        while(i<6){
            System.out.println("The value of i is: " + i);
            if(i==3){
                System.out.println("It is 3. So we are breaking.");
                break;
            }
            i++;

        }


        int j=0;
        while(j<=10){
            if(j%2==0){
                continue;
            }
            else{
                System.out.println("The number " + i + " is divisible by 3");
            }
            j++;
        }
    }
}
