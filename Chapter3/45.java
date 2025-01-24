import java.util.Scanner;

class fortyfive45 {
    private static String name;
    private static int balance;
    private static int amount;
    private static int uepin;
    private static String accountType;
    private static int pin = 1234;
    private static char txnType;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name: ");
        name = s.nextLine();
        
        System.out.println("Enter the type of account(current/savings): ");
        accountType = s.nextLine();
        
        System.out.println("Enter the balance: ");
        balance = s.nextInt();

        System.out.println("Enter your pin to perform transaction: ");
        uepin = s.nextInt();
        

        if(uepin==pin){
            System.out.println("Welcome " + name);
            System.out.println("You can transact in your " + accountType + " account.");


            System.out.println("Enter the amount for transaction: ");
            amount = s.nextInt();

            System.out.println("Enter the txn type(w/d): ");
            txnType = s.next().charAt(0);

            switch (txnType) {
                case 'd':
                    balance = amount + balance;
                    System.out.println(amount + " deposited succesfully.");
                    System.out.println("The total amount in bank is: " + balance);
                    break;
                
                case 'w':
                    if(balance>=amount){
                        balance = balance - amount;
                        System.out.println(amount + " withdrawn succesfully.");
                        System.out.println("The total amount in bank is: " + balance);
                    }
                    else{
                        System.out.println("Insufficient balance");
                    }
                    break;
            
                default:
                    break;
            }
        }
        else{
            System.out.println("Incorrect pin.");
        }
        s.close();
    }
}
