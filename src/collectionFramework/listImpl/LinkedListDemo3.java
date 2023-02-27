package collectionFramework.listImpl;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        Product product = new Product();
        Student student = new Student(1,"abc","pune");

        List list = new LinkedList();
        list.add(product);
        list.add(student);
        System.out.println(list);
    }
}
