
import java.util.*;
public class PosNegOrZero {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		if(num>0)
		{	
			System.out.println("The number is positive");
		}
		if(num<0)
		{	
			System.out.println("The number is negative");
		}
		if(num==0)
		{	
			System.out.println("The number is zero");
		}
	}

}
