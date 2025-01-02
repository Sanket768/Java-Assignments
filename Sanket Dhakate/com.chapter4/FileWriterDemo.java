/* Create a class FileWriterDemo to write object details to a file. */
import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("details.txt")) {
            writer.write("Product: Laptop\n");
            writer.write("Price: $800\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
