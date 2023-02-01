package oops.inheritance.example;

public class C extends B{
    void m1(){
        super.m1();
        System.out.println("C m1");
    }

    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}
