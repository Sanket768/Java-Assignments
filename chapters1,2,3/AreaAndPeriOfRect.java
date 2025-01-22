
import java.util.*;
public class AreaAndPeriOfRect {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double len=scanner.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		double bre=scanner.nextDouble();
		double peri=2*(len+bre);
		double area=len*bre;
		System.out.println("The perimeter and area of the rectangle are "+peri+" "+"and "+area+" "+"respectively");
	}

}
