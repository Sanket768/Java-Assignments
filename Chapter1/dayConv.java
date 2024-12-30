import java.util.Scanner;

class day {
    private int days;
    private double weeks;
    private double years;

    public void setData(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter days: ");
            days = s.nextInt();
        }
        finally{
            s.close();
        }
    }

    public void cal(){
        weeks = (double) days/7;
        System.out.println("Weeks: " + weeks);
        years = (double) days/365;
        System.out.println("Years: " + years);
    }
}

class dayConv {
    public static void main(String[] args) {
        day d = new day();
        d.setData();
        d.cal();
    }    
}
