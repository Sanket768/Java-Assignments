
import java.util.*;
public class NumMultipleOfTwoThreeOrFive {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		if(num%2==0 || num%3==0 || num%5==0)
		{	
			System.out.println("The number is a multiple of 2, 3 or 5");
		}
		else
		{
			System.out.println("The number is not a multiple of 2, 3 or 5");
		}
	}

}
