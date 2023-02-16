package exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);

        }
        //order of catch blocks should be from child to parent
        catch (ArithmeticException exception) {
            System.out.println("dr is zero");
        } catch (Exception exception) {

        }
    }
}
