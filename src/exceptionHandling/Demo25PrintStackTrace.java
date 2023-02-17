package exceptionHandling;

public class Demo25PrintStackTrace {
    static {
       // throw new ArithmeticException("/ by zero");
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
            System.out.println("catch");
        }
    }
}
