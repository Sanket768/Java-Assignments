/*
 * Create a base class Employee with a method calculateSalary(). Extend it 
 * to Manager and then to SeniorManager, overriding and enhancing the salary
 * calculation.
 */
class Employee {
    protected Double Salary = 10000.00;

    public void calculateSalary() {
        System.out.println("Normal Employee Salary: " + Salary);
    }
}

class Manager extends Employee {
    public void calculateSalary() {
        System.out.println("Manager's Salary: " + (2 * Salary));
    }
}

class SeniorManager extends Employee {
    public void calculateSalary() {
        System.out.println("Senior Manager's Salary: " + (4 * Salary));
    }
}

public class fifth {
    public static void main(String[] args) {
        SeniorManager Manage = new SeniorManager();
        Manage.calculateSalary();
        Manager manage = new Manager();
        manage.calculateSalary();
        Employee emp = new Employee();
        emp.calculateSalary();
    }
}
