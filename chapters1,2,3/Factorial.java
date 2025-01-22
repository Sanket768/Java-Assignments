
import java.util.*;
public class Factorial {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int fact=1;
		for(int i=num;i>=2;i--)
		{	
			fact=fact*i;
		}
		System.out.println("The factorial of "+num+" is "+fact);
	}
}
