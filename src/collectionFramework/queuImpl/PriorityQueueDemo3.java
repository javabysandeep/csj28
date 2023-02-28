package collectionFramework.queuImpl;

import collectionFramework.setImpl.Course;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class PriorityQueueDemo3 {
    public static void main(String[] args) {
       Queue<Course> courses = new PriorityQueue<>();
       Course course1 = new Course(101,"Core java","80 hours","java8","Mr. Sandeep",80000);
       Course course2 = new Course(12,"Advance java","40 hours","jdbc, servlet,jsp","Mr. Sandeep",40000);
       Course course3 = new Course(1,"Professional java","40 hours","jdbc, servlet,jsp","Mr. Sandeep",400000);
       Course course4 = new Course(3,"Premium Fullstack ","800 hours","JavaReactMicroServices","Mr. Sandeep",800000);

       courses.add(course1);
       courses.add(course2);
       courses.add(course3);
       courses.add(course4);

        for (int index = 1; index<=4 ; index++) {
            System.out.println(courses.poll());
        }

    }
}
