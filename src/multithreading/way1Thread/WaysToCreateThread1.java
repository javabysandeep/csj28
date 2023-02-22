package multithreading.way1Thread;

public class WaysToCreateThread1 {
    public static void main(String[] args) {
        Runnable job = ()->{
            for (int index = 1; index <100 ; index++) {
                System.out.println(index+" "+Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(job,"user-defined-thread");
        thread.start();
    }
}
