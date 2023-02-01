package oops.polymorphism.methodOverloading;

public class FinalPrivateStaticDemo {
    private void m1(){
        System.out.println("m1 without param");
    }
    private void m1(String str){
        System.out.println("m1 with param "+str);
    }

    static void m2(){
        System.out.println("m2 without param");
    }
    static void m2(String str){
        System.out.println("m2 with param "+str);
    }

    final void m3(){
        System.out.println("m3 without param");
    }
    final void m3(String str){
        System.out.println("m3 with param "+str);
    }
    public static void main(String[] args) {
        FinalPrivateStaticDemo ref = new FinalPrivateStaticDemo();
        ref.m1();
        ref.m1("Str");

        m2();
        m2("Str");

        ref.m3();
        ref.m3("str");
    }
}
