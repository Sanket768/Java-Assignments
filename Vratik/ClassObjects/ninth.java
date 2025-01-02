/*
 * 9. Encapsulated Class
Create a class Employee with private attributes like name, id, and salary. Provide getter and setter methods.
 */
class Emp {
    private String name;
    private int id;
    private double salary;

    public Emp(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

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
        this.salary = salary;
    }

}

public class ninth {
    public static void main(String[] args) {
        Emp emp = new Emp("John", 1, 5000.0);
        System.out.println("Name: " + emp.getName());
        System.out.println("Id: " + emp.getId());
        System.out.println("Salary: " + emp.getSalary());
        emp.setSalary(6000.0);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
