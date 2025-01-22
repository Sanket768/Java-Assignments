
import java.util.*;
public class FirstnTermsOfFibonacci {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of terms you want to generate of the Fibonacci series");
		int n=scanner.nextInt();
		int term1=0,term2=1,term3;
		System.out.println("The "+n+" terms of the Fibonacci series are");
		System.out.print(term1+" "+term2);
		for(int i=3;i<=n;i++)
		{
			term3=term1+term2;
			System.out.print(" "+term3);
			term1=term2;
			term2=term3;
		}
	}

}
