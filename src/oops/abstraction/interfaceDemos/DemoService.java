package oops.abstraction.interfaceDemos;

public interface DemoService {
    // by default variables are : public static final
    public static final int a=100;
    int b = 200;

    // by default methods are public abstract
    public abstract void m1();
    void m2();

    // constructors are not allowed : to support multiple inheritance
    //public DemoService(){}

    //{} // instance blocks are not allowed: to support multiple inheritance
    //static {}

    // by default nested classes in interface are : public static
    public static class Inner{}

}
