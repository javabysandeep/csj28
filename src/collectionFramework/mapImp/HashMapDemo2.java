package collectionFramework.mapImp;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //1. unique keys
        //2. no insertion order for keys
        //3. no sorting order for keys
        //4. keys can be homogeneous as well as heterogeneous
        //5. null insertion at key place is possible only once.
        //6. To maintain the uniqueness of keys it uses, equals and hashCode
        //7. no restrictions for values

        Map map = new HashMap();//container

        //add a entry : <key, value>
        map.put("ganesh",57);
        map.put("ganesh",60);
        map.put("ganesh",89);
        map.put(null,87);
        map.put(null,87);
        map.put(89,54);
        map.put("drona",68);
        map.put("arjun",97);
        System.out.println("No. of entries in the map "+map.size());
        System.out.println("Keys "+map.keySet());
        System.out.println("Values "+map.values());
        System.out.println(map);

    }
}
