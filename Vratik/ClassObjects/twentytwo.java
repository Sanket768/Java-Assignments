/*Create a Department class and an Employee class. Represent the "has-a" relationship. */
class Department {
    private String name;
    private Employee[] employees;

    public Department(String name, int numEmployees) {
        this.name = name;
        this.employees = new Employee[numEmployees];
    }

    public void addEmployee(Employee e) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = e;
                return;
            }
        }
    }

    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].displayEmployee();
            }
        }
    }

}

public class twentytwo {
    public static void main(String[] args) {
        
        /*
         * System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Type: " + employeeType);
         */
    }
}
