
/*8. Display the day of the week based on a number input (1 for Sunday, 2 for Monday,
etc.). */
import java.util.Scanner;

class DayOfWeek {
    private long day;

    public DayOfWeek(long day) {
        this.day = day;
    }

    public String getDay() {
        switch ((int) day) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }

}

public class eight {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the day of the week (1-7): ");
            long day = sc.nextLong();
            DayOfWeek dow = new DayOfWeek(day);
            System.out.println("The day of the week is: " + dow.getDay());
        }
    }
}
