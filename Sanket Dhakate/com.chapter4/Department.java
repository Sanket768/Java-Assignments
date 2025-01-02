/* Create a Department class and an Employee class. Represent the "has-a" relationship. */
class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Department {
    String name;
    Employee[] employees;

    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public void displayDetails() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.name + ", ID: " + emp.id);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 1),
            new Employee("Bob", 2)
        };
        Department dept = new Department("IT", employees);
        dept.displayDetails();
    }
}
