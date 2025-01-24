/*
 * Create a Loan class with attributes for principal, interest rate, and tenure. Add methods to calculate EMI.
 */

class Loan{
    private double principal;
    private double interestRate;
    private int tenure;

    public Loan(double principal, double interestRate, int tenure){
        this.principal = principal;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    public double calculateEMI(){
        double emi;
        double rate = interestRate / 100 / 12;
        int months = tenure * 12;
        emi = (principal * rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
        return emi;
    }

    public void display(){
        System.out.println("Principal: "+principal);
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Tenure: "+tenure);
        System.out.println("EMI: "+calculateEMI());
    }
}
public class twentysix {
    public static void main(String[] args) {
        Loan l = new Loan(100000, 10, 5);
        l.display();
    }
}
