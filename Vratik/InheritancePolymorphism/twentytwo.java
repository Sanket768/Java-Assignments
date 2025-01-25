/*
 * Create an array of Employee objects and display the details using polymorphism.
 */
class Employee{
    String name;
    int id;
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
public class twentytwo {
    public static void main(String[] args) {
        Employee[] emp = new Employee[4];
        emp[0] = new Employee("John", 1);
        emp[1] = new Employee("Doe", 2);
        emp[2] = new Employee("Jane", 3);
        emp[3] = new Employee("Rock", 4);
        for(Employee e: emp){
            e.display();
        }
    }
}
