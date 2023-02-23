package multithreading;

public class SleepMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("sleeping interpted");
                }
                System.out.println(i+"\t"+Thread.currentThread().getName());
            }
        },"thread");
        thread.start();

        //main thread
        for (int i = 1; i <=100 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("sleeping interpted");
            }
            System.out.println(i+"\t"+Thread.currentThread().getName());
        }

    }
}
