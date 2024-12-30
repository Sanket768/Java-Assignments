import java.util.Scanner;

class si {
    private float amount;
    private float period;
    private float interest;
    private int rate = 10;

    public void setData(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the amount: ");
            amount = s.nextFloat();
            System.out.println("Enter the period: ");
            period = s.nextFloat();
        }
        finally{
            s.close();
        }
    }

    public void calculateSi(){
        //si = prt/100
        interest = (float) amount*rate*period/100;
        System.out.println("Interest: " + interest);
    }
}

class simpleInterest {
    public static void main(String[] args) {
        si s = new si();
        s.setData();
        s.calculateSi();
    }
}
