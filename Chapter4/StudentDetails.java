class Student {
    private String name;
    private int age;
    private int roll;

    public void setData(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
    }
}

class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Aryan", 22, 11);
        s.display();
    }
}
