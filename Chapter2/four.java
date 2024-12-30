import java.util.Scanner;

class areacircum {
    private double rad;

    public void calareacircum(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the radius of circle: ");
            rad = s.nextDouble();
            double area = Math.PI*rad*rad;
            double circumference = 2*Math.PI*rad;
            System.out.println("Area of circle is: " + area);
            System.out.println("Circumference of Circle is: " + circumference);        }
        finally{
            s.close();
        }
    }
}

class four {
    public static void main(String[] args) {
        areacircum ac = new areacircum();
        ac.calareacircum();
    }
}
