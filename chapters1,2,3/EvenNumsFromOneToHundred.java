
import java.util.*;
public class EvenNumsFromOneToHundred {
	public static void main(String[] args)
	{
		System.out.println("The even numbers from 1 to 100 are");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
