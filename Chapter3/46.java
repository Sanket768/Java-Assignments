
class fortysix46 {
    
    public static int fact(int n) {
        try{
            if (n > 0) {
                return n * fact(n - 1);
            }
            else {
                return 1;
            }
        }
        finally{
           
        }
    }
    public static void main(String[] args) {
        fact(5);
        System.out.println("Factorial is: " + fact(5));
    }
}
