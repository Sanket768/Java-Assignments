/*
 * Write a program to count the number of objects created using a static variable.
 */
class CountObject {
    private static int count = 0;

    public CountObject() {
        count++;
    }

    public static int getCount() {
        return count;
    }

}

public class ninteenth {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        CountObject a = new CountObject();
        CountObject b = new CountObject();
        CountObject c = new CountObject();
        System.out.println("Number of objects created: " + CountObject.getCount());
    }
}
