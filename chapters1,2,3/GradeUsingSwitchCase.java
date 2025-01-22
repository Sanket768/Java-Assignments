
import java.util.*;
public class GradeUsingSwitchCase {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the grade");
		char grade=scanner.next().charAt(0);
		switch(grade)
		{
		case 'A':
			System.out.println("The student has scored marks in the range of 90 to 100");
			break;
		case 'B':
			System.out.println("The student has scored marks in the range of 80 to 89");
			break;
		case 'C':
			System.out.println("The student has scored marks in the range of 70 to 79");
			break;
		case 'D':
			System.out.println("The student has scored marks in the range of 60 to 69");
			break;
		case 'E':
			System.out.println("The student has scored marks less than 60");
			break;
		default:
			System.out.println("Invalid Grade");
		
		}
	}

}
