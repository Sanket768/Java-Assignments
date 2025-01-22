
import java.util.*;
public class MultTable {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int pro;
		for(int i=1;i<=10;i++)
		{
			pro=num*i;
			System.out.println(num+"x"+i+"="+pro);
		}
	}

}
