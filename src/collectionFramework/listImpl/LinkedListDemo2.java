package collectionFramework.listImpl;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        List list = new LinkedList();//container
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(140);
        System.out.println(list);
        System.out.println("After removal");
        list.remove(0);
        System.out.println(list);
        System.out.println("Delete all the elements of collection");
        list.clear();
        System.out.println(list);

    }
}
