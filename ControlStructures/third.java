/* Check if a year is a leap year. */
class LeapYear {
    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

public class third {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear(2000);
        System.out.println(leapYear.isLeapYear());
    }
}
