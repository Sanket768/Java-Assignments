
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int digit,sum=0;
		int oriNum=num;
		while(num!=0)
		{
			digit=num%10;
			num=num/10;
			sum=sum+digit;
		}
		System.out.println("The sum of digits in "+oriNum+" is "+sum);
	}
}
