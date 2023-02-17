package exceptionHandling;

public class Demo22 {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.exit(0);
        } catch (Exception exception) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
