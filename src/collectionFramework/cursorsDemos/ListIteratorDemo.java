package collectionFramework.cursorsDemos;

import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
        list.add(100);
        list.add(110);
        list.add(12);
        list.add(19);
        list.add(190);

        //this is also cursor but applicable for List impl
        // ArrayList, LInkedList, Vector, Stack
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


    }
}
