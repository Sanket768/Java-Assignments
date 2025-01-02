/* Create a Loan class with attributes for principal, interest rate, and tenure. Add methods to calculate EMI. */
class Loan {
    double principal;
    double interestRate;
    int tenure;

    public Loan(double principal, double interestRate, int tenure) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    public double calculateEMI() {
        double monthlyRate = interestRate / 12 / 100;
        int months = tenure * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }

    public static void main(String[] args) {
        Loan loan = new Loan(100000, 5, 10);
        System.out.println("EMI: " + loan.calculateEMI());
    }
}
