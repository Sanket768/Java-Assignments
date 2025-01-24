import java.util.Scanner;

class fortythree43 {
    private static double temperature;
    private static double convertedTemp;
    private static char convtype;
    public static void main(String[] args) 
    {
        try(Scanner s = new Scanner(System.in);){
            System.out.println("Enter the temperature: ");
        temperature = s.nextFloat();
        
        System.out.println("Convert to (f/c):");
        convtype = s.next().charAt(0);
        
        switch (convtype) {
            case 'f':
                    convertedTemp = (1.8*temperature) + 32;
                    System.out.println("Converted temp is: " + convertedTemp);
                    break;
                
            case 'c':
                    convertedTemp = (temperature-32)*0.55555;
                    System.out.println("COnverted temp is: " + convertedTemp);
                    break;
            
            default:
                    break;
        }
        
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

