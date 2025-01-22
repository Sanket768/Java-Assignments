
import java.util.*;
public class AreaAndCircumOfCircle {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double radius=scanner.nextDouble();
		double circum=2*Math.PI*radius;
		double area=Math.PI*radius*radius;
		System.out.println("The circumference and area of the circle are "+circum+" and "+area+" respectively");
	}

}
