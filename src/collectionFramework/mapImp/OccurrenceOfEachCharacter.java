package collectionFramework.mapImp;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "      welcome to collection framework class";
        char[] charArray = str.trim().replace(" ", "").toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch:charArray) {
            if(!charCountMap.containsKey(ch)){
                charCountMap.put(ch,1);
            } else{
                charCountMap.put(ch,charCountMap.get(ch)+1);
            }
        }
        System.out.println(charCountMap);
    }
}
