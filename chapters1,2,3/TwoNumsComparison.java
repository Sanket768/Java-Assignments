
import java.util.*;
public class TwoNumsComparison {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to be compared");
		int num1=scanner.nextInt();
		System.out.println("Enter the number to be compared with");
		int num2=scanner.nextInt();
		if(num1>num2)
		{
			System.out.println("The first number is greater than the second number");
		}
		else if(num1<num2)
		{
			System.out.println("The first number is smaller than the second number");
		}
		else
		{
			System.out.println("The first number is equal to the second number");
		}
	}

}
