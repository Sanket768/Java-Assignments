public class amu {

        public static void main(String[] args) {
            Runtime runtime = Runtime.getRuntime();

            long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("Memory before array creation: " + memoryBefore);

            int[] array = {1,2,3,4,5,6,7,8,9,0,2,3,5,2,4};
            System.out.println("Array length: " + array.length);

            long memoryAfterCreation = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("Memory after array creation: " + memoryAfterCreation);

            array = resizeArray(array, 20);
            long memoryAfterAdd = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("Memory after adding item: " + memoryAfterAdd);
    
            array = resizeArray(array, 5);
            long memoryAfterRemove = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("Memory after removing item: " + memoryAfterRemove);
        }
    
        // Helper method to resize array
        public static int[] resizeArray(int[] original, int newSize) {
            int[] newArray = new int[newSize];
            System.arraycopy(original, 0, newArray, 0, Math.min(original.length, newSize));
            return newArray;
        
    }
    
}
