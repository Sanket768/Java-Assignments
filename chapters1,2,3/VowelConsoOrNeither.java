
import java.util.*;
public class VowelConsoOrNeither {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scanner.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			ch=Character.toLowerCase(ch);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{	
				System.out.println("The character is a vowel");
			}
			else
			{	
				System.out.println("The character is a consonant");
			}
		}
		else
		{
			System.out.println("The character is neither a vowel nor a consonant");
		}
	}

}
