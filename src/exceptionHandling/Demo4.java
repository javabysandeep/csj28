package exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        try {
            String str = "null";
            System.out.println(str.length());
        } catch (NullPointerException nullPointerException) {
            System.out.println("No operations are allowed on null");
        }
        System.out.println("rest of the main method");
    }
}
