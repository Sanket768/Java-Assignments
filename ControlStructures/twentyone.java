
/* Write a program to display a menu and repeat the action until the user selects "exit." using do while loop*/
import java.util.*;

class FoodMenu {
    private final String[] menu;
    private int choice;

    public int retChoice() {
        return choice;
    }

    public FoodMenu() {
        menu = new String[5];
        menu[0] = "Pizza";
        menu[1] = "Burger";
        menu[2] = "Sandwich";
        menu[3] = "Salad";
        menu[4] = "Exit";
    }

    public void displayMenu() {
        System.out.println("Food Menu");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
    }

    public void getChoice(Scanner sc) {
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        while (choice < 1 || choice > 5) {
            System.out.print("Invalid choice. Please enter a number between 1 and 5: ");
            choice = sc.nextInt();
        }
    }

    public void displayChoice() {
        System.out.println("You have selected: " + menu[choice - 1]);
    }
}

public class twentyone {
    public static void main(String[] args) {
        FoodMenu fm = new FoodMenu();
        Scanner sc = new Scanner(System.in);
        try {
            do {
                fm.displayMenu();
                fm.getChoice(sc);
                fm.displayChoice();
            } while (fm.retChoice() != 5);
            System.out.println("Exiting...");
        } finally {
            sc.close();
        }

    }
}
