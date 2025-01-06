class Animal {
    protected void eat(){
        System.out.println("Dog eats pedigree!");
    }    
}
class AnimalDerived extends Animal {
    public void bark(){
        System.out.println("Dog barks bhow bhow");
    }
}

class m {
    public static void main(String[] args) {
        AnimalDerived ad = new AnimalDerived();
        ad.eat();
        ad.bark();
    }
}