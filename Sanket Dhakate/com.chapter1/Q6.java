/* Convert a given number of days into years, weeks, and days. */

import java.util.Scanner;
public class Q6 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int days  = scan.nextInt();
        double years  = (double) days / (365 + 0.25);
        int weeks =  days / 7;
        System.out.println("Years: " + years + "Weeks: " + weeks);
        
    }
}
