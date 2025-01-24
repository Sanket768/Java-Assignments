import java.util.Scanner;

class pythatriplets {
    private int a;
    private int b;
    private int c;

    public void checktriplets(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the first side of triangle: ");
            a = s.nextInt();
            System.out.println("Enter the second side of triangle: ");
            b = s.nextInt();
            System.out.println("Enter the third side of triangle: ");
            c = s.nextInt();


            if(((a*a)+(b*b)) == (c*c)){
                System.out.println("It is a pythagoras triplet");
            }
            else{
                System.out.println("It does not form Pythagoras triplet");
            }
        }
        finally{
            s.close();
        }
    }
}

class fifteen {
        public static void main(String[] args) {
        pythatriplets pt = new pythatriplets();
        pt.checktriplets();
    }
}
