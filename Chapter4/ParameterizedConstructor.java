class Parameterized {
    private double radius;
    private double area;
    private double circumference;

    public Parameterized(double radius){
        this.radius = radius;
        area = Math.PI*radius*radius;
        circumference = 2*Math.PI*radius;

        System.out.println("Area of circle with radius " + radius + " is " + area);
        System.out.println("Circumference of circle with radius " + radius + " is " + circumference);
    }
        
}

class ParameterizedConstructor {
    public static void main(String[] args) {
        Parameterized p = new Parameterized(10);
    }
}