
import java.util.*;
public class CheckIfPass {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the marks of the student out of 100");
		int marks=scanner.nextInt();
		if(marks>=20)
		{
			System.out.println("The student has passed");
		}
		else
		{
			System.out.println("The student has not passed");
		}
	}

}
