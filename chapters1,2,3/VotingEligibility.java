
import java.util.*;
public class VotingEligibility {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age of the person");
		int age=scanner.nextInt();
		if(age>=18)
		{
			System.out.println("The person is eligible for voting");
		}
		else
		{
			System.out.println("The person is not eligible for voting");
		}
	}

}
