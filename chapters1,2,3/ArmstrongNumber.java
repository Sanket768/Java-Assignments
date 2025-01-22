
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int digit, digitCube, sumCube=0;
		int oriNum=num;
		while(num!=0)
		{
			digit=num%10;
			num=num/10;
			digitCube=digit*digit*digit;
			sumCube=sumCube+digitCube;
		}
		if(sumCube==oriNum)
		{
			System.out.println("The number is an Armstrong Number");
		}
		else
		{
			System.out.println("The number is not an Armstrong Number");
		}
	}
}
