package collectionFramework.mapImp;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {
    public static void main(String[] args) {
        Map map = new HashMap();//container

        //add a entry : <key, value>
        map.put("ganesh",null);
        map.put("mohan",null);
        map.put("saurabh",null);
        map.put(null,null);
        map.put(null,null);
        map.put(89,null);
        map.put("drona",68);
        map.put("arjun",97);
        System.out.println("No. of entries in the map "+map.size());
        System.out.println("Keys "+map.keySet());
        System.out.println("Values "+map.values());
        System.out.println(map);

    }
}
