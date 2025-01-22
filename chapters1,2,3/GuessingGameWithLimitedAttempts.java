
import java.util.*;
public class GuessingGameWithLimitedAttempts {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int num=10;
		for(int i=1;i<=5;i++)
		{
			System.out.println("Guess the number");
			int guessNum=scanner.nextInt();
			if(guessNum==num)
			{
				System.out.println("You guessed the correct number");
				break;
			}
			else
			{
				System.out.println("You guessed the incorrect number");
			}
		}
	}
}
