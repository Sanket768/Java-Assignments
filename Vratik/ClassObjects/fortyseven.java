/* Extend the Thread class to create a counter. */
class Counter extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Counter: " + i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class fortyseven {
    public static void main(String[] args){
        Counter counter = new Counter();
        counter.start();
    }
}
