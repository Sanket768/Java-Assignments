import java.util.Scanner;

class twentyfour24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int i = 0;

            do{
                System.out.println(i);
                i++;
            }
            while(i<=10);
        }
        finally{
            s.close();
        }
    }
}
