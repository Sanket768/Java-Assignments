/* Create an enum for days of the week and display activities based on the day. */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public String activity() {
        switch (this) {
            case MONDAY: return "Go to work";
            case SATURDAY: return "Relax and enjoy";
            case SUNDAY: return "Prepare for the week";
            default: return "Regular work day";
        }
    }
}

public class Tests {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.activity());
        }
    }
}