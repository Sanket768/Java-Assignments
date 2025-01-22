
import java.util.*;
public class DaysToYearsWeeksDays {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of days");
		int numberOfDays=scanner.nextInt();
		int years=numberOfDays/365;
		int weeks=(numberOfDays%365)/7;
		int days=(numberOfDays%365)%7;
		System.out.println("The number of years, weeks and days are "+years+", "+weeks+" "+"and "+days+" "+"respectively");
	}

}
