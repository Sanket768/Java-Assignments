
import java.util.*;
public class UpperLowerOrNeither {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scanner.next().charAt(0);
		String status=null;
		if(ch>='A' || ch<='Z')
		{
			status="upper";
		}
		else if(ch>='a' || ch<='z')
		{
			status="lower";
		}
		else
		{
			status="neither";
		}
		switch(status)
		{
			case "upper":
				System.out.println("The character is an uppercase character");
				break;
			case "lower":
				System.out.println("The character is a lowercase character");
				break;
			case "neither":
				System.out.println("The character is neither an uppercase nor a lowercase character");
				break;
		}
	}
}
