
import java.util.*;
public class RootsOfQuadEqn {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the values of a, b and c");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		double x1=(-b+Math.pow(Math.pow(b,2)-4*a*c,1/2))/(2*a);
		double x2=(-b-Math.pow(Math.pow(b,2)-4*a*c,1/2))/(2*a);
		System.out.println("The roots of the quadratic equation ax^2 + bx + c are "+x1+" and "+x2);
	}

}
