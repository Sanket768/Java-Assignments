
import java.util.*;
public class GuessingGame {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int num=10,guessNum;
		do
		{
			System.out.println("Guess the number");
			guessNum=scanner.nextInt();
		}
		while(guessNum!=num);
		System.out.println("You guessed the correct number");
	}
}
