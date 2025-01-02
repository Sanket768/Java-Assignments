/*
 * 10. Validation in Setters
Modify the Employee class to validate the salary (e.g., must be positive).
 */

class Emp1 {
    private int id;
    private String name;
    private double salary;

    public Emp1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    public void getData(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

}

public class tenth {
    public static void main(String[] args) {
        Emp1 e = new Emp1(1,"Rahul",5000);
        e.getData();
        e.setSalary(6000);
        e.getData();
        e.setSalary(-1000);
        e.getData();
    }
}
