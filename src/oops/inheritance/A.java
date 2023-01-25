package oops.inheritance;

public class A  {
    static {
        System.out.println("Static block A");
    }
    {
        System.out.println("instance block of A");
    }
    public A() {
        System.out.println("A class con");
    }
}
// SBB IBB AC BC: yash
// SBB, IBB, CB, AC: sandesh
// SBB, IBB, CB, SBA, IBA,AC: harish
//SBA, SBB, IBA, IB