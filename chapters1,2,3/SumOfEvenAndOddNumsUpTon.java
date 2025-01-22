
import java.util.*;
public class SumOfEvenAndOddNumsUpTon {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number up to which you want to calculate the sum of all even and odd numbers");
		int n=scanner.nextInt();
		int sumEven=0,sumOdd=0;
		for(int i=1;i<=n;i++)
		{	
			if(i%2==0)
			{	
				sumEven=sumEven+i;
			}
			else
			{
				sumOdd=sumOdd+i;
			}
		}
		System.out.println("The sum of all the even numbers up to "+n+" is "+sumEven);
		System.out.println("The sum of all the odd numbers up to "+n+" is "+sumOdd);
	}

}
