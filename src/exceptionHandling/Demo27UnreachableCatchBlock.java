package exceptionHandling;

public class Demo27UnreachableCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            String str = null;
            System.out.println(str.length());
        }
       /* catch (Exception exception){
            System.out.println("generic handler");
        }*/
        catch (ArithmeticException arithmeticException){
            System.out.println("invalid denominator");
        }catch (NullPointerException nullPointerException){
            System.out.println("no operations on null are allowed");
        }
    }
}
