
public class Employee {
    private String name;
    private String department;
    private double salary;
    private int yearsOfService;
    private String employeeId;
    private String employeeType;
    public Employee(String n, String d, double s, int y, String empId, String empType) {
        name = n;
        department = d;
        salary = s;
        yearsOfService = y;
        employeeId = empId;
        employeeType = empType;
    }
    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Type: " + employeeType);
    }

}
