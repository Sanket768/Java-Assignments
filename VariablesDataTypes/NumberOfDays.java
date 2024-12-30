/*Convert a given number of days into years, weeks, and days. */
import java.util.Scanner;
public class NumberOfDays {
    public static void main(String[] args) {
        int days,years, weeks;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of days: ");
            days = sc.nextInt();
            years = days / 365;
            weeks = (days % 365) / 7;
            days = (days % 365) % 7;
            System.out.println(days + " days is equal to " + years + " years, " + weeks + " weeks, and " + days + " days.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
