
import java.util.*;
public class PowerOfNumUsingMult {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the base number");
		int base=scanner.nextInt();
		System.out.println("Enter the power");
		int power=scanner.nextInt();
		int result=1,i=1;
		if(power==0)
		{
			result=1;
		}
			
		do
		{
			result=result*base;
			i++;
		}
		while(i<=power);
		System.out.println(base+" raised to the power "+power+" is "+result);
	}

}
