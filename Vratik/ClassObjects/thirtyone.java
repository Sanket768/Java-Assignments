/*
 * Create an immutable Student class with final attributes and no setters.
 */
final class Student{
    private final String name;
    private final int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("Name: " + name + " " + "Age: " + age);
    }
}
public class thirtyone {
    public static void main(String[] args) {
        Student st = new Student("Aryan", 24);
        st.display();
    }
}
