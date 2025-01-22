
import java.util.*;
public class PythagoreanTriplet {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the height of the triangle");
		int height=scanner.nextInt();
		System.out.println("Enter the base of the triangle");
		int base=scanner.nextInt();
		System.out.println("Enter the hypotenuse of the triangle");
		int hypo=scanner.nextInt();
		if((height*height)+(base*base)==(hypo*hypo))
		{
			System.out.println("The three numbers form a Pythagorean triplet");
		}
		else
		{
			System.out.println("The three numbers do not form a Pythagorean triplet");
		}
	}

}
