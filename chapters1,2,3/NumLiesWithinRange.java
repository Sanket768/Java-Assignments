
import java.util.*;
public class NumLiesWithinRange {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num=scanner.nextInt();
		System.out.println("Enter the lower bound of the range");
		int lower=scanner.nextInt();
		System.out.println("Enter the upper bound of the range");
		int upper=scanner.nextInt();
		if(num>lower && num<upper)
		{
			System.out.println("The number lies within the range");
		}
		else
		{
			System.out.println("The number does not lie within the range");
		}
	}

}
