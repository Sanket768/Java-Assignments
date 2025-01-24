/*Create a program with synchronized methods to avoid race conditions. */
class Counter1{
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public synchronized void decrement(){
        count--;
    }
    public synchronized int value(){
        return count;
    }
}
class Counter2{
    private int count = 0;
    public void increment(){
        synchronized(this){
            count++;
        }
    }
    public void decrement(){
        synchronized(this){
            count--;
        }
    }
    public int value(){
        synchronized(this){
            return count;
        }
    }
}
class Counter3{
    private int count = 0;
    public void increment(){
        synchronized(Counter3.class){
            count++;
        }
    }
    public void decrement(){
        synchronized(Counter3.class){
            count--;
        }
    }
    public int value(){
        synchronized(Counter3.class){
            return count;
        }
    }
}
public class fortynine {
    public static void main(String[] args){
        Counter1 counter1 = new Counter1();
        Counter2 counter2 = new Counter2();
        Counter3 counter3 = new Counter3();
        counter1.increment();
        counter2.increment();
        counter3.increment();
        System.out.println("Counter1: " + counter1.value());
        System.out.println("Counter2: " + counter2.value());
        System.out.println("Counter3: " + counter3.value());
    }
}
