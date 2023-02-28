package collectionFramework.queuImpl;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        //Priority
        Queue<String> queue = new PriorityQueue<>();
        // Front/Head ------>    Rear/Tail

        //insertion from one end
        queue.add("Amit");
        queue.add("Akshay");
        queue.add("Vijay");
        queue.add("Gaurav");
        queue.add("Munjal");

        int queueSize = queue.size();
        for (int i = 1; i <=queueSize ; i++) {
            System.out.println(queue.poll());
        }


    }
}
