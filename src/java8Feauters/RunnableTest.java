package java8Feauters;

public class RunnableTest {
    public static void main(String[] args) {
        //way 1: traditional way
        Runnable runImpl = new RunImpl();
        runImpl.run();

        //way 2: anonymous class way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("anon is running");
            }
        };
        runnable.run();

        // way 3: lambda expression
        Runnable lambda = ()-> System.out.println("lambda is running");
        lambda.run();
    }
}
class RunImpl implements  Runnable{
    @Override
    public void run() {
        System.out.println("RunImpl is running");
    }
}
