
import java.util.*;
public class CelToFah {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius");
		float cel=scanner.nextFloat();
		float fah=(cel*(9/5))+32;
		System.out.println("The temperature in Fahrenheit is "+fah);
	}

}
