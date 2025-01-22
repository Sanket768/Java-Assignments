
import java.util.*;
public class SimpleInterest {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		float prin=scanner.nextFloat();
		System.out.println("Enter the rate");
		float rate=scanner.nextFloat();
		System.out.println("Enter the time period");
		float time=scanner.nextFloat();
		float si=(prin*rate*time)/100;
		System.out.println("The simple interest is "+si);
	}

}
