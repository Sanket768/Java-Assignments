import java.util.Scanner;

class eight {
    private static float num1;
    private static float num2;

    public static void print(){
            Scanner s = new Scanner(System.in);
            try{
                System.out.println("Enter num1: ");
                num1 = s.nextFloat();
                System.out.println("Enter num2: ");
                num2 = s.nextFloat();
    
                if(num1>num2){
                    System.out.println("The greater number is: " + num1);
                }
                else if(num2>num1){
                    System.out.println("The greater number is: " + num2);
                }
                else{
                    System.out.println("Both numbers are equal");
                }
            }
            finally{
                s.close();
            }
        }
        public static void main(String[] args) {
            print();
    }
}
