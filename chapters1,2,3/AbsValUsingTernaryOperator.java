
import java.util.*;
public class AbsValUsingTernaryOperator {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number other than zero");
		int num=scanner.nextInt();
		int abs=num>0?num:-num;
		System.out.println("The absolute value of the number is "+abs);
	} 

}
