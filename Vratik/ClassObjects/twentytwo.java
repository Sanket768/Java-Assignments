/*
 * Aggregation is a "has-a" relationship where one class contains another, 
 * but contained object can exist independently
 */
class Department{
    private String name;

    public Department(String name){
        this.name = name;
    }
    public String getNa(){
        return name;
    }
}
class Employee{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
public class twentytwo {
    public static void main(String[] args) {
        Department dp = new Department("Technical");
        Employee emp = new Employee("Aryan Chaple");
        System.out.println(emp.getName() + " is from "+ dp.getNa()+" department.");

}
}
