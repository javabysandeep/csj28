package classComponents.nestedClasses;

public class InnerClassDemo {
    //we need object of outer class to create object of inner class
    class Inner {
        // Inner class :
        // can't have static members as its members
        int instanceVariable = 100;

        void instanceMethod() {
            System.out.println("InnerClass instance method");
        }

        {
            System.out.println("InnerClass instance block");
        }

        Inner() {
            System.out.println("InnerClass constructor");
        }

        //static  int staticVariable = 200;//CTE
        //static void staticMethod(){ System.out.println("LIC static method");}//CTE
        //static {System.out.println("LIC instance block");}
        //static class NestedStatic{}//CTE
    }

    public static void main(String[] args) {

        // what is Inner class, : created at class level without static modifier
        // how to create object of Inner class:
        //          to create object we need outer class object and using that reference we can create the object of inner class
        // what all things we can include inside the inner class : non-static members
        InnerClassDemo outer = new InnerClassDemo();
        InnerClassDemo.Inner inner = outer.new Inner();
        System.out.println(inner.instanceVariable);
        inner.instanceMethod();
    }
}
