package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(81);
        integers.add(21);
        integers.add(31);
        integers.add(50);

        Predicate<Integer> ref = (number) -> number % 2 != 0;
        System.out.println(integers);
        integers.removeIf(ref);
        System.out.println(integers);


        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("aba");
        stringList.add("abn");
        stringList.add("aba");
        stringList.add("ana");
        stringList.add("xyz");
        stringList.add("pqr");
        stringList.add("mno");
        System.out.println(stringList);
        stringList.removeIf((string)->string.startsWith("a"));
        System.out.println(stringList);


    }
}
