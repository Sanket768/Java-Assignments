import java.util.Scanner;

class twentyone21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Pizza");
            System.out.println("2. Sandwich");
            System.out.println("3. Fries");
            System.out.println("4. Exit");
            System.out.print("Select an option to continue: ");

            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Ordered Pizza, Anything else?");
                    break;
                case 2:
                    System.out.println("Ordered Sandwich, Anything else?");
                    break;
                case 3:
                    System.out.println("Ordered Fries, Anything else?");
                    break;
                case 4:
                    System.out.println("Menu exited.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
        while (choice!=4);

        s.close();
    }
}
