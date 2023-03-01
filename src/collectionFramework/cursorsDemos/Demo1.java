package collectionFramework.cursorsDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(11);
        integerList.add(12);
        integerList.add(19);
        integerList.add(190);

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
