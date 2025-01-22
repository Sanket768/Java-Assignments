
import java.util.*;
public class Equation {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scanner.nextInt();
		System.out.println("Enter the value of b");
		int b=scanner.nextInt();
		double res=Math.pow(a+b, 3);
		System.out.println("The result of the equation (a+b)^3 is "+res);
	}

}
