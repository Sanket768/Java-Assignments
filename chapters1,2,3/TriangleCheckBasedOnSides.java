
import java.util.*;
public class TriangleCheckBasedOnSides {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first side");
		float side1=scanner.nextFloat();
		System.out.println("Enter the second side");
		float side2=scanner.nextFloat();
		System.out.println("Enter the third side");
		float side3=scanner.nextFloat();
		if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2)
		{	
			System.out.println("The three sides form a valid triangle");
		}
		else
		{	
			System.out.println("The three sides do not form a valid triangle");
		}
	}

}
