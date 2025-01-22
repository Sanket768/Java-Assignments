
import java.util.*;
public class CompoundInterest {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the principal");
		double prin=scanner.nextDouble();
		System.out.println("Enter the rate");
		double rate=scanner.nextDouble();
		System.out.println("Enter the time");
		double time=scanner.nextDouble();
		System.out.println("Enter the number of times interest applied");
		double num=scanner.nextDouble();
		long ci=(long) (prin*Math.pow(1+(rate/num), num*time)-prin);
		System.out.println("The compound interest is "+ci);
	}

}
