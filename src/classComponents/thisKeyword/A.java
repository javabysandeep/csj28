package classComponents.thisKeyword;

public class A {
    int a;
    int b;
    int c;

    public A() {
        // from a given constructor we can call maximum of only one constructor of the same class
        this(10);
       // this(10,20);
        //this(10,20,30);
    }

    public A(int a) {
        this.a = a;
    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    A getA(){
        return  this;
    }
    void m1(){
        m2(this);
    }
    void m2(A a){}
}
