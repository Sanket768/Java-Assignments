
import java.util.*;
public class AvgOfThreeNums {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		float num1=scanner.nextFloat();
		System.out.println("Enter the second number");
		float num2=scanner.nextFloat();
		System.out.println("Enter the third number");
		float num3=scanner.nextFloat();
		float avg=(num1+num2+num3)/3;
		System.out.println("The average is "+avg);
	}

}
