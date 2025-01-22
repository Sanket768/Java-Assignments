
import java.util.*;
public class IncByTenUntilExceedsHundred {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number less than 100");
		int num=scanner.nextInt();
		if(num>100)
		{	
			System.out.println("The number is already greater than 100");
		}
		else
		{	
			while(num<=100)
			{
				System.out.println(num);
				num=num+10;
			}
		}
	}

}
