package oops.polymorphism.methodOverloading;

public class Child extends Parent {
    void m1() {
        System.out.println("child m1");
    }

    void m1(int num) {
        System.out.println("child m1 "+num);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.m1("parent");
        child.m1();
        child.m1(100);
    }
}
