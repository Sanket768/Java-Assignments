import java.util.Scanner;

class eight {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        try{
        int num1;
        System.out.print("Enter a number: ");
        num1 = s.nextInt();

        switch (num1) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;
            
            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                break;
        }
    }
    finally{
        s.close();
    }
    }    
}
