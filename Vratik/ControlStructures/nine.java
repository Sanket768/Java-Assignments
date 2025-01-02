
/* Convert a month number (1-12) into its corresponding name using switch-case. */
import java.util.*;

class GetMonthName {
    private int month;

    public GetMonthName(int month) {
        this.month = month;
    }

    public String getMonthName() {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

}

public class nine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a month number (1-12): ");
            int month = sc.nextInt();
            GetMonthName obj = new GetMonthName(month);
            System.out.println("Month name: " + obj.getMonthName());
        }
    }
}
