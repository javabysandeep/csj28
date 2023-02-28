package collectionFramework.mapImp;

import java.util.*;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        Map map = new TreeMap<>();

        List<String> courses1 = new ArrayList<>();
        courses1.add("core java");
        courses1.add("advance java");
        courses1.add("frameworks");

        map.put("Sachin",courses1 );
        map.put("Ganesh",courses1 );
        System.out.println(map);

        Map<Customer, List<Order>> customerOrderMap = new HashMap<>();

    }
}
