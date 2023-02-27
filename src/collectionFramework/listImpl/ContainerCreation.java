package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.List;

public class ContainerCreation {
    public static void main(String[] args) {
        List oldList = new ArrayList();
        oldList.add("India");
        oldList.add("US");
        oldList.add("UK");
        oldList.add("Italy");
        oldList.add("Singapore");


        System.out.println(oldList);
        System.out.println("New list");
        List newList = new ArrayList();
        newList.addAll(oldList);//adds another collection. multiple values adding

        newList.add("Russia");
        System.out.println(newList);


        //remove single element
        oldList.remove("Italy");
        System.out.println("After removal");
        System.out.println(oldList);

        //remove multiple elements
        System.out.println("remove multiple elements");
        newList.removeAll(oldList);
        System.out.println(newList);

        //remove all
        oldList.clear();
        newList.clear();
        System.out.println(oldList);
        System.out.println(newList);

        //remove based on condition: removeIf(): java8 method


    }
}
