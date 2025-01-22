
import java.util.*;
public class SumOfFirstnNums {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter n");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{	
			sum=sum+i;
		}
		System.out.println("The sum of first n natural numbers is "+sum);
	}

}
