
import java.util.*;
public class FirstnTermsOfAPandGP {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first terms of AP and GP");
		int apStart=scanner.nextInt();
		int gpStart=scanner.nextInt();
		System.out.println("Enter the common difference of AP and common multiple of GP");
		int cd=scanner.nextInt();
		int cm=scanner.nextInt();
		System.out.println("Enter the number of terms");
		int nap=scanner.nextInt();
		int ngp=scanner.nextInt();
		for(int i=1;i<=nap;i++)
		{
			int t2=apStart+cd;
			int t3=t2+cd;
			t2=t3;
		}
		System.out.print(false);
	}
}
