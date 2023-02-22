package multithreading.way1Thread;

public class WaysToCreateThread2 {
    public static void main(String[] args) {
       // step 1 : create the class of type Runnable
            // 1. traditional way
            // 2. anonymous class
            //3. lambda expression
            //4. method reference
        Runnable runnable = new RunnableImpl();

        //step 2: create Thread class object and pass name & runnable type
        Thread thread = new Thread(runnable,"task");

        //step 3: call the start method
        thread.start();
    }
}
class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}
