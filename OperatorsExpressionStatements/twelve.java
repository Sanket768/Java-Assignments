/*
 * Write a program to check if a year is a leap year using logical operators.
 */
class LeapYear {
    int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) ||
                (year % 400 == 0 && year % 100 == 0);
    }
}

public class twelve {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear(2020);
        System.out.println(leapYear.isLeapYear());
    }
}
