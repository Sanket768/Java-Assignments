


public class Persons {

    
    String name;
    int age;

    
    public Persons() {
        this.name = "Unknown";
        this.age = 0;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        Persons Person = new Persons();
        Person.displayDetails();
    }
}

    
    