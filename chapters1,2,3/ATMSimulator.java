
import java.util.*;
public class ATMSimulator {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int bal=20000,task;
		do
		{
			System.out.println("ATM Simulator");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("Enter the task you want to perform");
			task=scanner.nextInt();
			switch(task)
			{
			case 1:
				System.out.println("Your balance is "+bal);
				break;
			case 2:
				System.out.println("Enter the amount you want to deposit");
				int depo=scanner.nextInt();
				bal=bal+depo;
				System.out.println("Your balance is "+bal);
				break;
			case 3:
				System.out.println("Enter the amount you want to withdraw");
				int with=scanner.nextInt();
				if(with>bal)
				{
					System.out.println("Insufficient Balance");
				}
				else
				{
					bal=bal-with;
					System.out.println("Your balance is "+bal);
				}
				break;
			case 4:
				System.out.println("Program exited");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
		while(task!=4);
	}
}
