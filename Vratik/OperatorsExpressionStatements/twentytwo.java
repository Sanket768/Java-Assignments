/* Write a program to increment a variable by 10 until it exceeds 100. */
class IncVariable {
    private int var;

    public IncVariable(int var) {
        this.var = var;
    }

    public void increment() {
        while (var <= 90) {
            var += 10;
            System.out.println("Value of variable is: " + var);
        }
    }
}

public class twentytwo {
    public static void main(String[] args) {
        IncVariable inc = new IncVariable(0);
        inc.increment();
    }
}
