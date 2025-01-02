/* Modify the Employee class to validate the salary (e.g., must be positive). */
public class Employeee {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    public static void main(String[] args) {
        Employeee emp = new Employeee();
        emp.setName("Bob");
        emp.setId(102);
        emp.setSalary(-5000);
        emp.setSalary(60000);

        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Salary: " + emp.getSalary());
    }
}
