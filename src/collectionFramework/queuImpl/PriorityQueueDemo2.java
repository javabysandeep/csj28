package collectionFramework.queuImpl;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        //Priority
        Queue<Integer> queue = new PriorityQueue<>();
        // Front/Head ------>    Rear/Tail

        //insertion from one end
        queue.add(10);
        queue.add(100);
        queue.add(200);
        queue.add(110);
        queue.add(18);

        int queueSize = queue.size();
        for (int i = 1; i <=queueSize ; i++) {
            System.out.println(queue.poll());
        }


    }
}
