import java.util.Scanner;

class traingleEquality{
    private double side1;
    private double side2;
    private double side3;

    public void checktriangle(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the first side of triangle: ");
            side1 = s.nextDouble();
            System.out.println("Enter the second side of triangle: ");
            side2 = s.nextDouble();
            System.out.println("Enter the third side of triangle: ");
            side3 = s.nextDouble();

            if( (side1+side2>side3) && (side2+side3>side1) && (side1+side3>side2) ){
                System.out.println("It forms a valid triangle!!");
            }
            else{
                System.out.println("It does not form a valid triange!");
            }
        }
        finally{
            s.close();
        }
    }
}

class nine {
    public static void main(String[] args) {
        traingleEquality t = new traingleEquality();
        t.checktriangle();
    }    
}
