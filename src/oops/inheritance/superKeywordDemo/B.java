package oops.inheritance.superKeywordDemo;

public class B extends A{
    int a = 200;
    void m1(){
        System.out.println("B class m1");
    }
    int getA(){
//        return a;
//        return this.a;
        return  super.a;
    }
    B(){
        System.out.println("B class con");
    }
}
