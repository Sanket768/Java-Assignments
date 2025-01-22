
import java.util.*;
public class CountDownFromNumToZero {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number greater than zero");
		int num=scanner.nextInt();
		System.out.println("The count down from the number to zero is");
		for(int i=num;i>=0;i--)
		{
			System.out.print(i+" ");
		}
	}

}
