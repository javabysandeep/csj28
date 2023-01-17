package classComponents.nestedClasses;

public class LocalInnerClass {
    public static void main(String[] args) {
        //Local Inner class :
        // can't have static members as its members
        // we canot access this class outside the method.
        // we define the class inside the method, use that inside the method
        class Local {
            int instanceVariable =100;
            void instanceMethod(){ System.out.println("LIC instance method");}
            {System.out.println("LIC instance block");}
            Local(){System.out.println("LIC constructor");}
            class InnerClass{}
            //static  int staticVariable = 200;//CTE
            //static void staticMethod(){ System.out.println("LIC static method");}//CTE
            //static {System.out.println("LIC instance block");}
            //static class NestedStatic{}//CTE
        }
        Local local = new Local();
        System.out.println("Instance variable "+local.instanceVariable);
        local.instanceMethod();
    }
}
