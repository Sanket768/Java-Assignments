// Create a Loan class with attributes for principal, interest rate, and tenure. Add methods to calculate EMI.

class BankLoan{
    public double principalAmt;
    public float rate;
    public float tenureInMonths;

    public BankLoan(double principalAmt, float rate, float tenure) {
        this.principalAmt = principalAmt;
        this.rate = rate;
        this.tenureInMonths = tenure;
    }


    public double EMIcalculate(){

        double EMI = (principalAmt * rate * Math.pow(1+rate,tenureInMonths)) / (Math.pow(1+rate, tenureInMonths) - 1);

        return EMI;
    }


    
}

public class BankLoanMain {

    public static void main(String[] args) {
        
        BankLoan b1 = new BankLoan(1000, 10, 12);
        b1.EMIcalculate();
    }
}
