abstract class volume {
    protected double radius;
    protected double height;
    protected double side;

    abstract public void vol();
}
class cube extends volume{

    public cube(double side){
        this.side = side;
    }
    public void vol(){
        double volume = side*side*side;
        System.out.println("Volume of cube is: " + volume);
    }
}
class cylinder extends volume{

    public cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public void vol(){
        double volume = Math.PI*radius*radius*height;
        System.out.println("Volume of cylinder is: " + volume);
    }
}
class cone extends volume{

    public cone(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public void vol(){
        double volume = Math.PI*radius*radius*height/3;
        System.out.println("Volume of cone is: " + volume);
    }
}

class five {
    public static void main(String[] args) {
        cone c = new cone(29340324,03940234234023.3409304);
        c.vol();
    }
}
