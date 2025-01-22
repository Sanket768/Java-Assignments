
import java.util.*;
public class AreaOfTriUsingHeronsFormula {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of the first side of the triangle");
		double side1=scanner.nextDouble();
		System.out.println("Enter the length of the second side of the triangle");
		double side2=scanner.nextDouble();
		System.out.println("Enter the length of the third side of the triangle");
		double side3=scanner.nextDouble();
		double semi=(side1+side2+side3)/2;
		double area=Math.pow(semi*(semi-side1)*(semi-side2)*(semi-side3), 1/2);
		System.out.println("The area of the triangle is "+area);
	}

}
