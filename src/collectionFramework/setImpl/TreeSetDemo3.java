package collectionFramework.setImpl;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
       Set<Course> courses = new TreeSet<>();
       Course course1 = new Course(101,"Core java","80 hours","java8","Mr. Sandeep",80000);
       Course course2 = new Course(12,"Advance java","40 hours","jdbc, servlet,jsp","Mr. Sandeep",40000);
       Course course3 = new Course(1,"Professional java","40 hours","jdbc, servlet,jsp","Mr. Sandeep",400000);
       Course course4 = new Course(3,"Premium Fullstack ","800 hours","JavaReactMicroServices","Mr. Sandeep",800000);

       courses.add(course1);
       courses.add(course2);
       courses.add(course3);
       courses.add(course4);

        for (Course course:courses) {
            System.out.println(course);
        }

    }
}
