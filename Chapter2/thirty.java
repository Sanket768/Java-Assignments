import java.util.Scanner;

class thirty {
    private static double num;
        public static void main(String[] args) {
        try(Scanner s =  new Scanner(System.in)){
            System.out.println("Enter a number: ");
            num = s.nextDouble();
            double absoulteValue = Math.abs(num);
            System.out.print("Absolute value is: ");
            System.out.println((num<0) ? absoulteValue : num);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
