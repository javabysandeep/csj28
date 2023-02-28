package collectionFramework.mapImp;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();//container

        //add a entry : <key, value>
        map.put("ganesh",57);
        map.put("ganesh",57);
        map.put("sachin",87);
        map.put("mondal",54);
        map.put("drona",68);
        map.put("arjun",97);
        System.out.println("No. of entries in the map "+map.size());
        System.out.println("Keys "+map.keySet());
        System.out.println("Values "+map.values());
        System.out.println(map);

    }
}
