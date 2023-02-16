package exceptionHandling;

public class Demo14 {
    public static void main(String[] args) {
        //throw keyword
        // implicitly object of ArithmeticException will be created and
        //it will be given to JRE
        // JRE will give this to exception handlers
        //System.out.println(10/0);
        throw  new ArithmeticException("/ by zero");
    }
}
