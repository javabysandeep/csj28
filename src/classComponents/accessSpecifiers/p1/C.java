package classComponents.accessSpecifiers.p1;

public class C {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        //System.out.println(a.b);//b is private
        System.out.println(a.c);// c is protected & can be accessed in the same package or in the child classes
        System.out.println(a.d);// d is default & can be accessed only within the same package
    }
}
