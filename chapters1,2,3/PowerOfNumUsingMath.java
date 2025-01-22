
import java.util.*;
public class PowerOfNumUsingMath {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the base number");
		int base=scanner.nextInt();
		System.out.println("Enter the power");
		int power=scanner.nextInt();
		double result=Math.pow(base, power);
		System.out.println(base+" raised to the power "+power+" is "+result);
	}

}
