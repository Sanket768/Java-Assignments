class Engine{
    private String type;

    public Engine(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
class Car{
    private String color;
    private Engine engineType;

    public Car(String color, String engineType){
        this.color = color;
        this.engineType = new Engine(engineType);
    }

    public String display(){
        return "Car color: " + color + ", Engine: "+engineType.getType();
    }
}
public class twentythree {
    public static void main(String[] args){
        Car cr = new Car("Red", "V8");
        System.out.println(cr.display());

    }
}
