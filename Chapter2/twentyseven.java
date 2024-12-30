import java.util.Scanner;

class twentyseven {
    private static int num;

    public static void method(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();
            
            // if(num<0){
            //     System.out.println("Negative number");
            // }
            // else if(num>0){
            //     System.out.println("Positive number");
            // }
            // else{
            //     System.out.println("Zero");
            // }

            System.out.println((num==0 ? "Zero" : (num>0 ? "Positive number" : "Negative number")));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            s.close();
        }
    }

    public static void main(String[] args) {
        method();
    }
}
