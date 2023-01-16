package classComponents.nestedClasses;

public class Demo1 {
    static int b;
    static void m2(){}
    static { System.out.println("static block");}
    static class B {}

    public static void main(String[] args) {
        class Local{}
    }
    int a;
    void m1(){}
    {System.out.println("instance block");}
    class A {}
    public Demo1() {}
    public Demo1(int a) {this.a = a;}




}
