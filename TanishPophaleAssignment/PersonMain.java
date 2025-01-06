// Write a Person class with a default constructor that initializes default values.

// Also

// Create a parent class Person with a method display(). Use super to call it in the child class Student.

class Person{
    public String name;
    public int age;
    public int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("Person Details: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
        System.out.println("");
    }
    
}


class Student extends Person{
    
    public Student(String name, int age, int id){
        super(name, age, id);
    }
}

public class PersonMain {
    
    public static void main(String[] args) {
        
        Person p1 = new Student("Yau", 28, 1);
        Person p2 = new Student("Tanu", 43, 2);
        p1.display();
        p2.display();
    }
}
