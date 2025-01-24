import java.util.Scanner;

class six {
    public static void main(String[] args){
        //Calculator
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter a number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the operation to be performed (+,-,%,/): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;

            case '%':
                System.out.println(num1%num2);
                break;
            
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                break;
        }
        scanner.close();
    }    
}
