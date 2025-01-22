
import java.util.*;
public class PrimeNumsUptoNum {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int primeCheckNumber;
		int n = 1;
		int divisibleCount;

		while (n <= num) {
		 divisibleCount = 0;
		 primeCheckNumber = 2;
		 while (primeCheckNumber <= n / 2) {
		  if (n % primeCheckNumber == 0) {
		   divisibleCount++;
		   break;
		  }
		  primeCheckNumber++;
		 }
		 if (divisibleCount == 0 && n != 1) {
		  System.out.print(n + " ");
		 }
		 n++;
		}
	}
}
