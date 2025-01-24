/*
 * Write a program to filter and display employees earning above a certain amount using lambdas.
 */
import java.util.*;
import java.util.stream.*;
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
}
public class fortythree {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 5000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 40000));


        double threshold = 45000;
        List<Employee> filteredEmployees = employees.stream().filter(e -> e.getSalary() > threshold).collect(Collectors.toList());

        System.out.println("Employees earning above " + threshold + ":");
        for(Employee employee : filteredEmployees){
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}

