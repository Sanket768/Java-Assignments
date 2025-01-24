/*
 * Create a Logger class as a singleton to maintain a single instance throughout the program.
 */
class Logger{
    //1 
    public static Logger L = null;
    private int a,b;

    // Default Constructor
    private Logger(){
        a = b = 0;
    }

    // Parameterized Constructor
    private Logger(int a1, int b1){
        a = a1;
        b = b1;
    }

    public void setData(int a1, int b1){
        a = a1;
        b = b1;
    }

    public void display(){
        System.out.println(a + " " + b);
    }

    public static Logger getInstance(){
        // Lazy initialization
        if(L == null){
            L = new Logger(10,20);
        }
        return L;
    }
}
public class thirty {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.display();
        Logger log2 = Logger.getInstance();
        log2.display();
        Logger log3 = Logger.getInstance();
        log2.setData(111,222);
        log1.display();
        log2.display();
        log3.display();
    }
}
