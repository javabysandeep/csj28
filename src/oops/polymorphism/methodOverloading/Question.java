package oops.polymorphism.methodOverloading;

import oops.encapsulation.Student;

public class Question {
    public static void main(String[] args) {
        m1(null);
    }
   /* static  void m1(String str){
        System.out.println("String "+str);
    }*/
    static  void m1(Student student){
        System.out.println("Student "+student);
    }
    static void m1(Object obj){
        System.out.println("Object "+obj);
    }
}
