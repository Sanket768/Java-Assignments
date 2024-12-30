
/*
 * Compute the volume of a cube, cylinder, and cone using expressions.
 */

class VolumeCube {
    private double side;

    public VolumeCube(double side) {
        this.side = side;
    }

    double volume() {
        return side * side * side;
    }
}

class VolumeCylinder {
    private double radius;
    private double height;
    private double pi = 3.14159;
    private double volume;

    public VolumeCylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double volume() {
        volume = pi * Math.pow(radius, 2) * height;
        return volume;
    }

}

class VolumeCone {
    private double radius;
    private double height;
    private double pi = 3.14159;
    private double volume;

    public VolumeCone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double volume() {
        volume = (1.0 / 3.0) * pi * Math.pow(radius, 2) * height;
        return volume;
    }
}

public class fifth {
    public static void main(String[] args) {
        VolumeCube cube = new VolumeCube(5);
        System.out.println("Volume of cube: " + cube.volume());
        VolumeCylinder cylinder = new VolumeCylinder(5, 10);
        System.out.println("Volume of cylinder: " + cylinder.volume());
        VolumeCone cone = new VolumeCone(5, 10);
        System.out.println("Volume of cone: " + cone.volume());
    }
}
