
import java.util.*;
public class MathExpression {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		double c=Math.pow(a, 2)+(2*a*b)+Math.pow(b, 2);
		System.out.println("The result of the mathematical expression a^2 + 2ab + b^2 is "+c);
	}

}
