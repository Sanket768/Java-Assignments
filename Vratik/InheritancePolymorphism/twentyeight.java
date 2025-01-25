/*
 * Demonstrate dynamic binding by calculating bonuses for employees of different types (Manager, Developer).
 */
class Employee {
    public void calculateBonus(int salary) {
        System.out.println("Employee bonus: " + salary * 0.05);
    }
}

class Manager extends Employee {
    @Override
    public void calculateBonus(int salary) {
        System.out.println("Manager bonus: " + salary * 0.1);
    }
}

class Developer extends Employee {
    @Override
    public void calculateBonus(int salary) {
        System.out.println("Developer bonus: " + salary * 0.08);
    }
}



public class twentyeight {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee m = new Manager();
        Employee d = new Developer();
        e.calculateBonus(10000);
        m.calculateBonus(10000);
        d.calculateBonus(10000);
    }
}
