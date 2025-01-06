import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public void setData(){
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter the length of Rectangle: ");
            length = s.nextDouble();

            System.out.println("Enter the breadth of Reactangle: ");
            breadth = s.nextDouble();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void area(){
        double area = length*breadth;
        System.out.println(area);
    }
    public void perimeter(){
        double perimeter = 2*(length+breadth);
        System.out.println(perimeter);
    }
}

class RectangleArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setData();
        r.area();
        r.perimeter();
    }        
}
