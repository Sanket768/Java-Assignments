import java.util.Scanner;

class fourteen {
    private static int a;
    
    private static void validate(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter age: ");
            a = s.nextInt();
            if(a>0 && a<150){
                System.out.println("Valid age");
            }
            else{
                System.out.println("Invalid age");
            }
        }
        finally{
            s.close();
        }
    }

    public static void main(String[] args) {
        validate();
    }
}
