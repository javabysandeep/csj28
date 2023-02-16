package exceptionHandling;

public class Demo19 {

    public static void main(String[] args) {
        try {
            Class.forName("exceptionHandling.Demo180");
        } catch (ClassNotFoundException e) {
            System.out.println("class is invalid");
        }
    }
}
