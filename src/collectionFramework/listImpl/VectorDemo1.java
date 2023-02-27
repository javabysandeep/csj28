package collectionFramework.listImpl;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        List list = new Vector();
        Student student1 = new Student(1,"abc","pune");
        Student student2 = new Student(1,"abc","pune");
        Student student3 = new Student(1,"abc","pune");
        Student student4 = new Student(1,"abc","pune");
        Student student5 = new Student(1,"abc","pune");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        //System.out.println(list);

        for (int index = 0; index < list.size() ; index++) {
            System.out.println(list.get(index));
        }
    }
}
