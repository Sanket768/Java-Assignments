
import java.util.*;
public class MultTablesFromOneToTen {
	public static void main(String[] args)
	{
		int pro;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Multiplication Table of "+i);
			for(int j=1;j<=10;j++)
			{
				pro=i*j;
				System.out.println(i+"x"+j+"="+pro);
			}
		}
	}
}
