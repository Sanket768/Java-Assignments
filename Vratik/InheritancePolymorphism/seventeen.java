/*
 * Create an abstract class Employee with an abstract method calculateSalary(). 
Implement it in PermanentEmployee and ContractEmployee.
 */
class Emp{
    public void calSalary(){

    }
}
class PermanentEmp extends Emp{
    public void calSalary(float sal){
        System.out.println(sal*10);
    }
}
class ContractEmployee extends Emp{
    public void calSalary(float sal){
        System.out.println(sal*3);
    }
}
public class seventeen {
    public static void main(String[] args) {
        ContractEmployee ce = new ContractEmployee();
        PermanentEmp pe = new PermanentEmp();
        ce.calSalary(10000);
        pe.calSalary(10000);
    }
}
