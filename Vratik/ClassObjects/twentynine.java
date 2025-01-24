/*
 * Create a class FileReaderDemo to read and display object details from a file.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo{
    public void readProductFromFile(String filename){
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
public class twentynine {
    public static void main(String[] args) {
        FileReaderDemo fileReaderDemo = new FileReaderDemo();
        fileReaderDemo.readProductFromFile("products.txt");
    }
}
