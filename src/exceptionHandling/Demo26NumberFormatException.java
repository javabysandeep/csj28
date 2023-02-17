package exceptionHandling;

public class Demo26NumberFormatException {
    public static void main(String[] args) {
        String str = "12345a";//NumberFormatException
        int i = Integer.valueOf(str);
        System.out.println(i);
    }
}
