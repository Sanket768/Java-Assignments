import java.util.Scanner;

class fortyfour44 {
    private static char light;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the color(r/g/y): ");
            light = s.next().charAt(0);

            switch (light) {
                case 'r':
                    System.out.println("Red light! Stop.");
                    break;
                
                case 'g':
                    System.out.println("Green. Car can pass.");

                case 'y':
                    System.out.println("Yellow, Slow down");
                default:
                    break;
            }
        }
        finally{
            s.close();
        }
    }
}
