
import java.util.*;
public class PerfectNumsUptoLimit {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the limit till which you want to generate perfect numbers");
		int limit=scanner.nextInt();
		int sum = 1;
		for(int i=2;i<=limit;i++)
		{
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
				if(j!=i/j)
				{
					sum=sum+i/j;
				}
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}
