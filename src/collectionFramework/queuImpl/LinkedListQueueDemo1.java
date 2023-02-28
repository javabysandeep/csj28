package collectionFramework.queuImpl;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo1 {
    public static void main(String[] args) {
        //FIFO: First In First Out
        Queue<String> queue = new LinkedList<>();
        // Front/Head ------>    Rear/Tail

        //insertion from one end
        queue.add("Amit");
        queue.add("Akshay");
        queue.add("Vijay");
        queue.add("Gaurav");
        queue.add("Munjal");

        //Inspection from one end
        System.out.println("Who is next for the ticket : "+queue.peek());
        System.out.println("Size of the queue "+queue.size());

        //Deletion from one end
        System.out.println("Deleted "+queue.remove());
        System.out.println("Size of the queue "+queue.size());



    }
}
