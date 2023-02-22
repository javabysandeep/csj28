package multithreading.way1Thread;

import java.time.LocalDateTime;

public class Sum {
    public static long sum = 0;

    public static void main(String[] args) {
        //main thread job: to execute main method
        LocalDateTime startTime = LocalDateTime.now();
        for (long i = 1; i <= Long.MAX_VALUE-1; i++) {
            sum += i;
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Sum "+sum);
        System.out.println("Time taken to sum "+(endTime.getSecond()-startTime.getSecond()));
    }
}
