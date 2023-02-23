package multithreading.producerConsumer;

public class Product {
    synchronized void produce()  {
        while (true) {
            System.out.println("Producing product \t"+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    synchronized void consume()  {
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
            System.out.println("consuming product \t"+Thread.currentThread().getName());
            notify();
        }
    }
}
