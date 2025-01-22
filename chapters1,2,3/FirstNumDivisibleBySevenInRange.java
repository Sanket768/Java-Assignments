
import java.util.*;
public class FirstNumDivisibleBySevenInRange {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the start of the range");
		int start=scanner.nextInt();
		System.out.println("Enter the end of the range");
		int end=scanner.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%7==0)
			{
				System.out.print("The first number divisible by 7 in the range from "+start+" to "+end+" is "+i);
				break;
			}
		}
	}
}
