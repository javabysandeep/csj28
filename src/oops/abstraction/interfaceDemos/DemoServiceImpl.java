package oops.abstraction.interfaceDemos;

public class DemoServiceImpl implements DemoService{
    @Override
    public void m1() {
        System.out.println(" child m1 method");
    }

    @Override
    public void m2() {
        System.out.println("child m2 method");
    }

    public static void main(String[] args) {
        DemoService demoService = new DemoServiceImpl();
        demoService.m1();
        demoService.m2();
    }
}
