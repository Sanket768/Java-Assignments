

public class Validation {
    


    
    private String name;
    private int salary;

    
    public Validation(String name, int salary) {
        this.name = name;
        setSalary(salary);  
    }

    
    public String getName() {
        return name;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(int  salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be positive.");
        }
    }

    
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    
    public static void main(String[] args) {
        Validation emp1 = new Validation("John", 5000);
        emp1.displayDetails();
        
        
        emp1.setSalary(-2000);  
        emp1.displayDetails();  
    }
}


