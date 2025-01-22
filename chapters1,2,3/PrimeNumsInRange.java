
import java.util.*;
public class PrimeNumsInRange {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the start of the range");
		int start=scanner.nextInt();
		System.out.println("Enter the end of the range");
		int end=scanner.nextInt();
		for(int number=start;number<=end;number++)
		{
			for(int i=2;i<=Math.sqrt(number);i++)
			{
				if(number%i==0)
				{
					
				}
				else
				{
					System.out.print(number+" ");
				}
			}
		}
	}
}
