
import java.util.*;
public class GCDOfTwoNums {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scanner.nextInt();
		System.out.println("Enter the second number");
		int num2=scanner.nextInt();
		int oriNum1=num1;
		int oriNum2=num2;
		while(num2!=0)
		{
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		System.out.println("The GCD of "+oriNum1+" and "+oriNum2+" is "+num1);
	}
}
