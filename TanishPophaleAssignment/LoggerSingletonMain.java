//  Create a Logger class as a singleton to maintain a single instance throughout the program.

class LoggerSingleton{

    private static LoggerSingleton s = new LoggerSingleton();

    public static void print(){
        System.out.println("This is singleton class.");
    }

    public static LoggerSingleton getInstance(){
        return s;
    }

    public String toString(){
        return "This is singleton class.";
    }
}

public class LoggerSingletonMain {
    
    public static void main(String[] args) {
        
        LoggerSingleton.getInstance(); 
        LoggerSingleton.print();

    }
}

