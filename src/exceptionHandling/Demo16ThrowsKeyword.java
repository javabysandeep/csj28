package exceptionHandling;

public class Demo16ThrowsKeyword {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10,0));
        } catch (ArithmeticException arithmeticException){
            System.out.println("invalid dr");
        }
        System.out.println("rest of main method");
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }
}
