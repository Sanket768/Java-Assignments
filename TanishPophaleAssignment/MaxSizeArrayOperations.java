// Program to find the time required and memory used by the program to execute. Try to execute a case where array can contain maximum size i.e if it is an integer array then array can contain integers(data type) max size into it. For that you need to calculate the memory taken and time taken. It is not possible in this system to use array of integer max size since it gives error but try to maximum it can handle


public class MaxSizeArrayOperations {
    
    public static void main(String[] args) {
        

        // Initial Memory Tracking Start
        long startTime = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        
        Integer maxSize = 300000000;
        // int maxSize = Integer.MAX_VALUE;
        Integer a[] = new Integer[maxSize];

        for(int i=0;i<maxSize;i++){
            a[i] = i;
        }


        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long endTime = System.nanoTime();

        // Calculation of memory used and time taken
        long memoryUsedInBytes = memoryAfter - memoryBefore;
        long timeTaken = endTime - startTime;

        long memoryUsedinMB = memoryUsedInBytes /(1024 *1024);

        System.out.println("The time taken by the array to store " + maxSize + " elements is: " + timeTaken + " milliseconds.");
        System.out.println("The memory used by the array to store " + maxSize + "  elements is " + memoryUsedinMB + " MB");
    }
}
