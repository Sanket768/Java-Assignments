
import java.util.*;
public class NumOfDigits {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int digit, count=0;
		int oriNum=num;
		while(num!=0)
		{
			digit=num%10;
			num=num/10;
			count++;
		}
		System.out.println("The number of digits in "+oriNum+" is "+count);
	}
}
