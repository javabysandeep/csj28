package collectionFramework.cursorsDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(110);
        list.add(12);
        list.add(19);
        list.add(190);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            if(element %2!=0){
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
