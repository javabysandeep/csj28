package classComponents.thisKeyword;

public class Demo1 {
    int instanceVariable = 100;
    Demo1(){
        //calling param con from zero param con
        this(100);// constructor call
        // we can call the same class constructor with this keyword
        // call to the constructor must be the first line in the constructor body
        System.out.println("zero param con");
    }

    Demo1(int instanceVariable){
        System.out.println(" param con");

    }
    void m1() {
//        m2();
        this.m2();//instance method
        System.out.println("m1");
        System.out.println("Instance variable "+this.instanceVariable);
    }

    void m2() {
        System.out.println("m2");
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.m1();
    }
}
