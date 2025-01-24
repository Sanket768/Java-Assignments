import java.util.Scanner;

class twenty20 {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();
            boolean flag = true;
            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                    flag = false;
                }
            }
            if(flag==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        finally{
            s.close();
        }
    }
}
