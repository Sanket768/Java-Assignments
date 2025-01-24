import java.util.Scanner;

class result {
    private int m1;
    private int m2;
    private int m3;
    private String name;

    public void calculateresult(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the name of student: ");
            name = s.nextLine();
            System.out.println("Enter mark of first subject: ");
            m1 = s.nextInt();
            System.out.println("Enter mark of second subject: ");
            m2 = s.nextInt();
            System.out.println("Enter mark of third subject: ");
            m3 = s.nextInt();


            if( (m1>=35) && (m2>=35) && (m3>=35) ){
                System.out.println(name + " has passed the exam!!");
            }
            else{
                System.out.println(name + " has failed the exam!!");
            }
        }
        finally{
            s.close();
        }
    }
}

class ten {
    public static void main(String[] args) {
        result r = new result();
        r.calculateresult();
    }
}
