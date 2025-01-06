class Default {
    private String name;
    private int age;

    public Default(){
        name = "Aryan";
        age = 22;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class DefaultConstructor {
    public static void main(String[] args) {
        Default d = new Default();
    }    
}
