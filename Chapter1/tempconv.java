import java.util.Scanner;

class ctf {
    private float celcius;
    private float fahrenheit;

    public void setData(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter temperature in Celcius: ");
            celcius = s.nextFloat();
        }
        finally{
            s.close();
        }
    }
    public void conv(){
        //f = 1.8*c + 32
        fahrenheit = (float) ((1.8*celcius) + 32);
        System.out.println("Temperature in Celcius: " + celcius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
class tempconv {
    public static void main(String[] args) {
        ctf c = new ctf();
        c.setData();
        c.conv();
    }
}
