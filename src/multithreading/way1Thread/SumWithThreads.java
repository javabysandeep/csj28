package multithreading.way1Thread;

import java.time.LocalDateTime;

public class SumWithThreads extends Thread {
    public static long sum = 0;

    @Override
    public void run() {
        for (int i = Integer.MAX_VALUE/2+1; i <= Integer.MAX_VALUE-1; i++) {
            sum += i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SumWithThreads thread = new SumWithThreads();
        thread.start();

        //main thread job: to execute main method
        LocalDateTime startTime = LocalDateTime.now();
        for (int i = 1; i <= Integer.MAX_VALUE/2; i++) {
            sum += i;
        }
        //to stop the thread
        thread.join();//main thread will wait to complete the execution of another thread

        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Sum "+sum);
        System.out.println("Time taken to sum "+(endTime.getSecond()-startTime.getSecond()));
    }
}
