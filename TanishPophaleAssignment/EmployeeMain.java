// Create a class Employee with private attributes like name, id, and salary. Provide getter and setter methods.

// Also Modify the Employee class to validate the salary (e.g., must be positive).

class Employee{
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary){
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
        if(salary>0){
            this.salary = salary;
        }
        else{
            System.out.println("Salary cant be negative.");
        }
    }

    
}


public class EmployeeMain {
    

    public static void main(String[] args) {
        
        Employee e1 = new Employee("Tanu", 1, 123511.36);
        Employee e2 = new Employee("Tanu2", 2, 133511.36);
    }
}
