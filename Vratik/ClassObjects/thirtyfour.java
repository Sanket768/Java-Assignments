/*
 * Create an enum for days of the week and display activities based on the day.
 */
enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class thirtyfour {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        switch (day){
            case MONDAY:
            System.out.println("Go to work");
            break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Relax");
                break;
            default:
                System.out.println("Work hard");
                break;
        }
    }
}
