package exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException nullPointerException) {
            System.out.println("No operations are allowed on null");
            System.out.println(10/0);
        }
        finally {
            System.out.println("closing the database connections");
        }
        System.out.println("rest of the main method");// this line will not be executed
    }
}
