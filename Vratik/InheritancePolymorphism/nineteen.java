/*
 * Create an interface Game with methods start() and end(). Implement it 
in Cricket and Football.
 */
interface Game{
    public void start();
    public void end();
}
class Cricket implements Game{
    public void start(){
        System.out.println("Cricket is starting...");
    }
    public void end(){
        System.out.println("Cricket is ending...");
    }
}
class Football implements Game{
    public void start(){
        System.out.println("Football is starting");
    }
    public void end(){
        System.out.println("Football is ending");
    }
}
public class nineteen {
    public static void main(String[] args) {
        Cricket ct = new Cricket();
        Football fb = new Football();
        ct.start();
        ct.end();
        fb.start();
        fb.end();
    }
}
