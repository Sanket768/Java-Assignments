
import java.util.*;
public class MenuUntilExit {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("1. Pizza - 100");
		System.out.println("2. Burger - 50");
		System.out.println("3. Pasta - 80");
		System.out.println("4. Ice Cream - 30");
		System.out.println("5. Exit"); 
		int choice, totalAmount=0;
		do {
		System.out.print("Enter your choice: ");
		choice = scanner.nextInt(); 
		switch (choice) {
		case 1:
			totalAmount=totalAmount+100;
		break;
		case 2:
			totalAmount=totalAmount+50;
		break;
		case 3:
			totalAmount=totalAmount+80;
		break;
		case 4:
			totalAmount=totalAmount+30;
		break;
		case 5:
			System.out.println("Your total amount is: " + totalAmount);
		break;
		default:
		System.out.println("Invalid choice. Please enter a valid option.");
		}
		} while (choice != 5);
		} 
		 
		
		
	}

