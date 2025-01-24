/* convert a given number of days into years weeks and days  */
public class ConvertDays {
    public static void main(String[] args){
        int day = 600;
        int years = day/365;
        int weeks = ( day % 365 )/7;
        int days = ( day % 365) % 7 ;
        System. out .println("YEAR:"+ years +",WEEKS: " +weeks+ ",DAYS: " + days);
    }
}
