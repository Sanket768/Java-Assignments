import java.util.ArrayList;
import java.util.List;

public class ArrayMemoryUsage {
    public static void main(String[] args) {
        // Create a list to simulate the array for dynamic operations
        List<Integer> array = new ArrayList<>();

        // Add elements in bulk
        addElementsInBulk(array, 2000000000);
        System.out.println("Memory used after adding elements:");
        computeMemoryUsage(array);

        // Remove elements in bulk
        removeElementsInBulk(array, 2000000000);
        System.out.println("Memory used after removing elements:");
        computeMemoryUsage(array);
    }

    // Method to add elements in bulk
    public static void addElementsInBulk(List<Integer> array, int count) {
        for (int i = 1; i <= count; i++) {
            array.add(i);
        }
        System.out.println(count + " elements added to the array.");
    }

    // Method to remove elements in bulk
    public static void removeElementsInBulk(List<Integer> array, int count) {
        for (int i = 0; i < count && !array.isEmpty(); i++) {
            array.remove(array.size() - 1); // Remove from the end
        }
        System.out.println(count + " elements removed from the array.");
    }

    // Method to compute memory usage
    public static void computeMemoryUsage(List<Integer> array) {
        Runtime runtime = Runtime.getRuntime();

        // Garbage collection to ensure accurate memory measurement
        runtime.gc();

        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();

        // Simulate memory used by this array (including wrapper object overhead)
        int size = array.size();
        long memoryPerInteger = Integer.BYTES + 16; // 16 bytes for Integer object overhead
        long estimatedArrayMemory = size * memoryPerInteger;

        System.out.println("Estimated memory used by array: " + estimatedArrayMemory + " bytes");
        System.out.println("Actual memory used: " + usedMemoryBefore + " bytes");
    }
}
