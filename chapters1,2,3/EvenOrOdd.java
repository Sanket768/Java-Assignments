
import java.util.*;
public class EvenOrOdd {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number other than zero");
		int num=scanner.nextInt();
		if(num%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}

}
