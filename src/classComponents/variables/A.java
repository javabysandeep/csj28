package classComponents.variables;

public class A {
    int a = 10;
    static int b = 20;

    void m1(){}
    void instanceMethod() {
        //IV
        System.out.println("Instance variable "+a);
        //IM
        m1();//instance method call
        //SV
        System.out.println("Static variable "+b);
        //SM
        m2();//static method call
    }

    static  void m2(){}

    static void staticMethod() {
        //m1();//CTE
        //SOP(a);//CTE
        A ref = new A();
        //IV
        System.out.println("Instance variable "+ref.a);
        //IM
        ref.m1();//instance method call
        //SV
        System.out.println("Static variable "+b);
        //SM
        m2();//static method call
    }
}
