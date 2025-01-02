/*
 * Compare two floating-point numbers and display which one is larger.
 */
class Compare {
    private float a, b;

    public Compare(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void compare() {
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (a < b) {
            System.out.println(a + " is smaller than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }

    }
}

public class eight {
    public static void main(String[] args) {
        Compare compare = new Compare(10.5f, 20.5f);
        compare.compare();
    }
}
