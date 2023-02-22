package multithreading.way1Thread;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("running");
    }
}
