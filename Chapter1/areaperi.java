import java.util.Scanner;

class ap {
    private double a;
    private double b;
    private double area;
    private double peri;

    public void setData(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter first side: ");
            a = s.nextDouble();
            System.out.println("Enter second side: ");
            b = s.nextDouble();
        }
        finally{
            s.close();
        }
    }

    public void area(){
        area = a*b;
        System.out.println("Area os rectangle is: " + area);
    }
    public void peri(){
        peri = 2*(a+b);
        System.out.println("Perimeter of rectangle is: " + peri);
    }
}

class areaperi {
    public static void main(String[] args) {
        ap a = new ap();
        a.setData();
        a.area();
        a.peri();
    }
}
