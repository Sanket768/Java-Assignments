
import java.util.*;
public class DivisibleByThreeAndFive {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		if(num%3==0 && num%5==0)
		{
			System.out.println("The number is divisible by both 3 and 5");
		}
		else
		{
			System.out.println("The number is not divisible by both 3 and 5");
		}
	}

}
