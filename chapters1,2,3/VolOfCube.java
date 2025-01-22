
import java.util.*;
public class VolOfCube {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the edge of the cube");
		float edge=scanner.nextFloat();
		float vol=edge*edge*edge;
		System.out.println("The volume of the cube is "+vol);
	}

}
