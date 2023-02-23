package multithreading.synchronization;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(()-> {
            for (int i = 1; i <=100000 ; i++) {
                counter.increment();
            }
            },"thread1");
        Thread thread2 = new Thread(()-> {
            for (int i = 1; i <=100000 ; i++) {
                counter.increment();
            }
        },"thread2");
        Thread thread3 = new Thread(()-> {
            for (int i = 1; i <=100000 ; i++) {
                counter.increment();
            }
        },"thread3");

        //start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        //main thread job
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Count "+counter.count);
    }
}
