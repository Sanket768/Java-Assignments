/* Write a program to count the number of objects created using a static variable. */
class Counter {
    static int objectCount = 0;

    public Counter() {
        objectCount++;
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Number of objects created: " + Counter.objectCount);
    }
}
