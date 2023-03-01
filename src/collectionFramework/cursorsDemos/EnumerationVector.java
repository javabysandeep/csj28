package collectionFramework.cursorsDemos;

import java.util.*;

public class EnumerationVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(110);
        vector.add(12);
        vector.add(19);
        vector.add(190);

        //this is also cursor but applicable for Vector
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }



    }
}
