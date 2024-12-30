import java.util.Scanner;

class twentyeight {
    private static int age;
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter the age: ");

            age = s.nextInt();
            
            // (a > 60) ? System.out.println("jjskbn") : System.out.println("jvbsnn");

            System.out.println((age>=60) ? "Eligible for Senior citizen benefits" : "Ineligible for Senior citizen benefits");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
