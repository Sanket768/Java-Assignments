class Encapsulated {
    private String name;
    private int id;
    private int salary;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        if(this.salary>0){
            this.salary = salary;
        }
        else{
            System.out.println("Invalid salary");
        }
    }
}

class EncapsulatedClass {
    Encapsulated e = new Encapsulated();
}
