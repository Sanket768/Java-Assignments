
import java.util.*;
public class RandomNumUntilCondition {
	public static void main(String[] args)
	{
		int randomNum;
		do
		{
			randomNum=(int) (Math.random()*100);
			System.out.println(randomNum);
		}
		while(randomNum%7!=0);
			
	}
}
