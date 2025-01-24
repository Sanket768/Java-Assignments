/*
 * Solve the producer-consumer problem using threads and synchronization.
 */
class Producer implements Runnable {
    private final Buffer buffer;
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.produce(i);
        }
    }
}
class Consumer implements Runnable {
    private final Buffer buffer;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.consume();
        }
    }
}
class Buffer {
    private int data;
    private boolean empty;
    public Buffer() {
        this.empty = true;
    }
    public synchronized void produce(int data) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.data = data;
        this.empty = false;
        System.out.println("Produced: " + data);
        notify();
    }
    public synchronized void consume() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + data);
        this.empty = true;
        notify();
    }
}
public class fifty {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
