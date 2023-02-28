package collectionFramework.setImpl;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //1. unique: no duplicates
        //2. sorting order will be maintained
        //3. insertion order will not be maintained
        //4. can store homogeneous data only
        //5. cannot store heterogeneous data as sorting is required.
        //6. cannot store null even once otherwise NullPointerException
        //7. to maintain the uniqueness of elements it uses internally Comparable { compareTo() } or Comparator {compare()}
        //8. internally it uses TreeMap
        //9. It works on Red Black Tree Data structure.

        Set set = new TreeSet();
        set.add(100);
        set.add(100);
        set.add(10);
        set.add(1);
        set.add(11);
        set.add(13);
       // set.add("abc");
       // set.add("abc");
        //set.add("xyz");
        //set.add(null);
        //set.add(null);
        //set.add('A');
        System.out.println(set);
        System.out.println("size of set "+set.size());
    }
}
