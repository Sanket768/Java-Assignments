/* Create a Logger class as a singleton to maintain a single instance throughout the program. */
class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started.");
    }
}