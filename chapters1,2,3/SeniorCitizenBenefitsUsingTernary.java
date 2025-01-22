
import java.util.*;
public class SeniorCitizenBenefitsUsingTernary {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age of the person");
		int age=scanner.nextInt();
		String eligibility=age>=60?"eligible":"not eligible";
		System.out.println("The person is "+eligibility+" for senior citizen benefits");
	}

}
