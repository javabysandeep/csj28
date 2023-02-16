package exceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10/0);
            }catch (ArithmeticException arithmeticException){
                System.out.println("invalid denominator");
            }
            System.out.println("try");
        }catch (ArithmeticException arithmeticException){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");
    }
}
