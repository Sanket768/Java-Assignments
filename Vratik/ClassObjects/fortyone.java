/*
 * Serialize and deserialize an object of the Employee class.
 */
import java.io.*;
class Emp implements Serializable{
    private String name;
    private int id;

    public Emp(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
public class fortyone {
    public static void main(String[] args) {
        Emp employee = new Emp("John Doe", 123);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))){
            oos.writeObject(employee);
            System.out.println("Employee object serialized.");
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))){
            Emp deserializedEmployee = (Emp) ois.readObject();
            System.out.println("Employee object deserialized. ");
            System.out.println("Name: " + deserializedEmployee.getName());
            System.out.println("ID: " + deserializedEmployee.getId());
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
