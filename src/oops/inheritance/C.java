package oops.inheritance;

public class C extends B{
    static {
        System.out.println("static block c");
    }
    {
        System.out.println("instance block c");
    }
    public C() {
       // super(); //call to the super class
        System.out.println("C class con");
    }
}
