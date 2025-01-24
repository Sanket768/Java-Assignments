/*
 * Create a class Employee with attributes like name and id. Extend it in Manager and use super to initialize parent class attributes.
 */
class Employee{
    protected String name = "Sanket";
    protected int id = 12;
}
class Manager extends Employee{
    public Manager(){
        System.out.println("Name: " + super.name + " ID: " + super.id);
    }
}
public class elevan {
    public static void main(String[] args) {
        new Manager();
    }
}
