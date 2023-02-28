package collectionFramework.mapImp;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachString {
    public static void main(String[] args) {
        String string = "java developer is creating apps. React is creating apps";
        String[] stringArray = string.trim().split(" ");
        Map<String, Integer> charCountMap = new HashMap<>();
        for (String str:stringArray) {
            if(!charCountMap.containsKey(str)){
                charCountMap.put(str,1);
            } else{
                charCountMap.put(str,charCountMap.get(str)+1);
            }
        }
        System.out.println(charCountMap);
    }
}
