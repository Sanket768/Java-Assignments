
import java.util.*;
public class StopWhenNegNum {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number");
			int num=scanner.nextInt();
			if(num<0)
			{
				System.out.println("A negative number is encountered. Hence the processing is stopped.");
				break;
			}
		}
	}
}
