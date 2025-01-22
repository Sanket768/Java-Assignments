
import java.util.*;
public class CountdownTimer {
	public static void main(String[] args) throws InterruptedException
	{
		int start=10;
		while(start>=0)
		{
			System.out.println("Time remaining "+start+" seconds");
			start--;
			Thread.sleep(1000);
		}
		System.out.println("Countdown Complete");
	}
}
