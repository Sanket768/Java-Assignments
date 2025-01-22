
import java.util.*;
public class PosNegOrZeroTernary {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		String status=num==0?"Zero":(num>0?"Positive":"Negative");
		System.out.println("The status of the number is "+status);
	}

}
