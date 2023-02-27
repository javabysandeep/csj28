package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(101);
        integerList.add(2);
        integerList.add(310);
        integerList.add(41);
        integerList.add(23);
        Collections.sort(integerList);//sort
        System.out.println(integerList);


        List<String> countries = new ArrayList();
        countries.add("India");
        countries.add("US");
        countries.add("UK");
        countries.add("Italy");
        countries.add("Singapore");
        Collections.sort(countries);//sort
        System.out.println(countries);

    }
}
