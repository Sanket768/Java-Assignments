/*
 * Check if three given numbers can form a Pythagorean triplet.
 */
class Pythagorean{
    private int a, b, c;
    public Pythagorean(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isPythagorean(){
        if(a*a + b*b == c*c){
            return true;
        }
        else{
            return false;
        }
    }
}
public class fifteen {
    public static void main(String[] args) {
        Pythagorean p = new Pythagorean(3, 4, 5);
        System.out.println(p.isPythagorean());
        Pythagorean p1 = new Pythagorean(34, 5, 5);
        System.out.println(p1.isPythagorean());
    }
}
