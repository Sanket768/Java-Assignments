
import java.util.*;
public class GradesUsingTernary {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the marks of the student");
		int marks=scanner.nextInt();
		char grade=(marks>=90 && marks<=100)?'A':((marks>=80 && marks<=89)?'B':((marks>=70 && marks<=79)?'C':'D'));
	    System.out.println("The grade assigned to the student is "+grade);
	}

}
