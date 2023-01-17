package classComponents.nestedClasses;

public class StaticNestedDemo {

    static class StaticNestedClass {
        // Static nested class :
        // can have both  static and non-static members as its members
        int instanceVariable = 100;

        void instanceMethod() {
            System.out.println("StaticNestedClass instance method");
        }

        {System.out.println("StaticNestedClass instance block");}

        StaticNestedClass() {
            System.out.println("StaticNestedClass constructor");
        }

        static  int staticVariable = 200;
        static void staticMethod(){ System.out.println("StaticNestedClass static method");}
        static {System.out.println("StaticNestedClass  static block");}
        static class NestedStatic{}
    }

    public static void main(String[] args) {

        // what is StaticNestedClass class, : created at class level with static modifier
        // how to create object of StaticNestedClass class:  we need outer class name
        // what all things we can include inside the StaticNestedClass class : static and non-static members

        StaticNestedDemo.StaticNestedClass ref = new StaticNestedClass();
        System.out.println("Static nested class instance variable "+ref.instanceVariable);
        ref.instanceMethod();
        System.out.println("Static nested class static variable "+ StaticNestedDemo.StaticNestedClass.staticVariable);
        StaticNestedDemo.StaticNestedClass.staticMethod();

    }
}
