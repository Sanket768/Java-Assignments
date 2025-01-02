/*
 * 3. Rectangle Area
Create a class Rectangle with methods to calculate area and perimeter. Accept the dimensions via a constructor.
 */
class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
        this.length = 10;
        this.width = 50;
    }
        public int getArea(){
            return this.length * this.width;
            }
            public int getPerimeter(){
                return 2 * (this.length + this.width);
                }
}
public class third {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of Rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle is: " + rectangle.getPerimeter());
    }
}
