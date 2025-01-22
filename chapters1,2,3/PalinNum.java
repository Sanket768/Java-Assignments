
import java.util.*;
public class PalinNum {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int oriNum=num;
		int rev=0;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==oriNum)
		{	
			System.out.println("The number is a palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}

}
