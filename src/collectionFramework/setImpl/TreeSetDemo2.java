package collectionFramework.setImpl;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        //1. unique: no duplicates
        //2. sorting order will be maintained
        //3. insertion order will not be maintained
        //4. can store homogeneous data only
        //5. cannot store heterogeneous data as sorting is required.
        //6. cannot store null even once otherwise NullPointerException
        //7. to maintain the uniqueness of elements it uses internally Comparable { compareTo() } or Comparator {compare()}
        //8. internally it uses TreeMap
        //9. It works on Red Black Tree Data structure.

        Set<String> courses = new TreeSet();
        courses.add("core java");
        courses.add("advance java");
        courses.add("hibernate");
        courses.add("spring core");
        courses.add("spring mvc");
        courses.add("spring aop");
        courses.add("spring boot");
        courses.add("spring rest");
        courses.add("spring security");
        courses.add("spring jdbc");
        courses.add("spring data jpa");
        courses.add("maven");
        courses.add("git");
        courses.add("junit");
        courses.add("lombok");
        courses.add("gradle");
        courses.add("linux");
        courses.add("docker");
        courses.add("kubernetis");
        courses.add("AWS");
        courses.add("Jenkins");

        for (String course:courses) {
            System.out.println(course);
        }
        System.out.println("size of courses "+courses.size());
    }
}
