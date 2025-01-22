
import java.util.*;
public class ArithmeticOperations {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		float num1=scanner.nextFloat();
		System.out.println("Enter the second number");
		float num2=scanner.nextFloat();
		float sum=num1+num2;
		float diff=num1-num2;
		float prod=num1*num2;
		float quot=num1/num2;
		float remain=num1%num2;
		System.out.println("The sum is "+sum);
		System.out.println("The difference is "+diff);
		System.out.println("The product is "+prod);
		System.out.println("The quotient is "+quot);
		System.out.println("The remainder is "+remain);
	}

}
