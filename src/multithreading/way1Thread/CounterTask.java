package multithreading.way1Thread;

public class CounterTask extends Thread{
    public static long sum = 0;

    @Override
    public void run() {
        for (int i = 1; i <Integer.MAX_VALUE/2 ; i++) {
            sum = sum + i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CounterTask task = new CounterTask();
        task.start();

        //job of main thread
        for (int i = Integer.MAX_VALUE/2+1; i <Integer.MAX_VALUE ; i++) {
            sum = sum + i;
        }
        // wait for another thread to complete task

        System.out.println(sum);
    }
}
