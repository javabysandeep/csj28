package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ArrayListDemo1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        // can store homo/heterogeneous
        // duplicate
        // null*
        // Insertion order is maintained
        // growable array DS
        //best for retrival of data
        //worst for modification of data
        list.add(100);
        list.add(100);
        list.add("abc");
        list.add("abc");
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.size());
        System.out.println(list);
    }
}
