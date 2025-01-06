
class Rectangle{
    private int len;
    private int bred;

    Rectangle(int len, int bred){
        this.len = len;
        this.bred = bred;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getBred() {
        return bred;
    }

    public void setBred(int bred) {
        this.bred = bred;
    }

    public int area(){
        int area = this.len * this.bred;
        return area;
    }

    public int perimeter(){
        int perimeter = 2 * (this.len + this.bred);
        return perimeter;
    }
}

public class RectangleMain {
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(12, 13);
        int areaRec = r1.area();
        int periRec = r1.perimeter();

        System.out.println("The area of rectangle is: " + areaRec);
        System.out.println("The perimeter of rectangle is: "+ periRec);
    }
}
