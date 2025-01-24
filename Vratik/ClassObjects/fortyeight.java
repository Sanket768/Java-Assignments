/* Implement Runnable to perform multiple tasks in threads. */
class Task1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task 1 is running");
    }
}
class Task2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task 2 is running");
    }
}
class Task3 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task 3 is running");
    }
}
class Task4 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task 4 is running");
    }
}
class Task5 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task 5 is running");
    }
}
class Task6 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task 6 is running");
    }
}
public class fortyeight {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);
        Thread thread5 = new Thread(task5);
        Thread thread6 = new Thread(task6);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
