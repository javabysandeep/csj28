package multithreading;

public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                System.out.println(i+"\t"+Thread.currentThread().getName());
            }
        },"thread");
        thread.start();
        thread.join();//main thread will wait for custom thread to complete the execution

        //main thread
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i+"\t"+Thread.currentThread().getName());
        }

    }
}
