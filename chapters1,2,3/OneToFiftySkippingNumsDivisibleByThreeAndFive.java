
import java.util.*;
public class OneToFiftySkippingNumsDivisibleByThreeAndFive {
	public static void main(String[] args)
	{
		System.out.println("All the numbers from 1 to 50 skipping the numbers divisible by both 3 and 5 are");
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				continue;
			}
			System.out.print(i+" ");
		}
		
	}
}
