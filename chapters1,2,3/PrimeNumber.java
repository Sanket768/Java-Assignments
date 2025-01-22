
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number greater than 1");
		int num=scanner.nextInt();
		String status = null;
		if(num==2)
		{
			System.out.println("The number is a prime number");
		}
		else
		{	
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0)
				{	
					status="composite";
					break;
				}
				else
				{
					status="prime";
					break;
				}
			}
			System.out.println("The number is a "+status+" number");
		}
	}

}
