import java.util.Scanner;

public class TemperaturecelToFar {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Temperature in degree celsius: ");

        double tempCel = sc.nextDouble();

        double tempFar = ((tempCel * 9)/5) + 32;

        System.out.println("The temperature convertion from " + tempCel + " degree celsius to Fahrenite is: " + tempFar);
    }
}
