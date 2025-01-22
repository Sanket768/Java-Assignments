
import java.util.*;
public class TrafficLightSystem {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Traffic Light System");
			System.out.println("1. Red");
			System.out.println("2. Yellow");
			System.out.println("3. Green");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Stop. The light is Red");
				break;
			case 2:
				System.out.println("Get Ready. The light is Yellow");
				break;
			case 3:
				System.out.println("Go. The light is Green");
				break;
			case 4:
				System.out.println("Program Exited");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
		while(choice!=4);
	}
}
